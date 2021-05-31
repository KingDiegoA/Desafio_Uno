package desafioacl.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import desafioacl.model.ChallengeAclModelRequest;
import desafioacl.model.ChallengeAclModelResponse;
import desafioacl.service.ChallengeAclService;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeAclImplService implements ChallengeAclService {
    private final Path storage;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

    public ChallengeAclImplService() throws IOException {
        storage = Paths.get("JsonResponse").toAbsolutePath().normalize();
        Files.createDirectories(storage);
    }


    @Override
    public ChallengeAclModelResponse findDates(ChallengeAclModelRequest input) {
        ChallengeAclModelResponse challengeAclModelResponse  = new ChallengeAclModelResponse();

        challengeAclModelResponse.setId(input.id());
        challengeAclModelResponse.setFechaCreacion(input.getFechaCreacion());
        challengeAclModelResponse.setFechaFin(input.getFechaFin());
        challengeAclModelResponse.setFechas(input.getFechas());

        List<LocalDate> fechasFaltantes = new ArrayList<>();
        for(LocalDate date = input.getFechaCreacion(); date.isBefore(input.getFechaFin().plusMonths(1)); date = date.plusMonths(1)) {
            if (!input.getFechas().contains(date)){
                fechasFaltantes.add(date);
            }
        }
        challengeAclModelResponse.setFechasFaltantes(fechasFaltantes);
        FolderJson(input,challengeAclModelResponse);
        return challengeAclModelResponse;

    }


    private void FolderJson(ChallengeAclModelRequest request, ChallengeAclModelResponse response) {
        try {
            Path file = Paths.get("JsonResponse").toAbsolutePath().normalize();
            Files.createDirectories(file);


            Path targetRequest = file.resolve("request.json");
            FileOutputStream streamRequest = new FileOutputStream(targetRequest.toString());
            streamRequest.write(gson.toJson(request).getBytes());
            streamRequest.close();

            Path targetResponse = file.resolve("salida.json");
            FileOutputStream streamResponse = new FileOutputStream(targetResponse.toString());
            streamResponse.write(gson.toJson(response).getBytes());
            streamResponse.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
