package pl.sii.service;

import jakarta.inject.Singleton;
import pl.sii.model.Conference;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class ConferenceService {

    private static final List<Conference> CONFERENCES = Arrays.asList(
            new Conference("SII Get .Net"),
            new Conference("SII Get Digital")
    );

    public Conference randomConf() {
        return CONFERENCES.get(new Random().nextInt(CONFERENCES.size()));
    }

}
