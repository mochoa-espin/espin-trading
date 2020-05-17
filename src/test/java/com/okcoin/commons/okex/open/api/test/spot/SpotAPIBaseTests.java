package com.okcoin.commons.okex.open.api.test.spot;

import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.enums.I18nEnum;
import com.okcoin.commons.okex.open.api.test.BaseTests;

public class SpotAPIBaseTests extends BaseTests {

    public APIConfiguration config() {
        final APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.okex.com/");
        config.setApiKey("06f16808-6962-4a86-bb66-fed45447b61c");
        config.setSecretKey("0E2F5352415FDB0FBCB450D0C43AFAD1");
        config.setPassphrase("R6ZOkefhb8c2ZHw");

        /*config.setApiKey("43c59fe7-1e5a-4f41-a5d1-23a1b08c4149");
        config.setSecretKey("6E70B823656FD9EA453C760F9AC4D2BC");
        config.setPassphrase("ksSpdnBH3U");*/

        config.setPrint(true);
        config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);

        return config;
    }

}
