package desafioacl.controller;


import desafioacl.model.ChallengeAclModelRequest;
import desafioacl.model.ChallengeAclModelResponse;
import desafioacl.service.ChallengeAclService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/api")
@RestController //punto de entrada

public class ChallengeAclController { //contructor
    private final ChallengeAclService challengeAclService;

    public ChallengeAclController(ChallengeAclService challengeAclService) {
        this.challengeAclService = challengeAclService;

    }

    @PostMapping("/challenger")

    public ChallengeAclModelResponse challenger(@RequestBody ChallengeAclModelRequest model){ //metodo

        return challengeAclService.findDates(model);

    }

}
