package com.wavesenterprise.contract.api;

import com.wavesenterprise.sdk.contract.api.annotation.ContractInit;
import com.wavesenterprise.sdk.contract.api.annotation.InvokeParam;

public interface IContract {

    @ContractInit
    void init();

    class Keys {
        public static final String USER_MAPPING_PREFIX = "USERS";
    }

    class PostalCodes {
        public static final int RostovOnDon = 344000;
        public static final int TaganrogMainPostOffice = 347900;
        public static final int TaganrogPostOffice1 = 347901;
        public static final int TaganrogPostOffice2 = 347902;
        public static final int TaganrogPostOffice3 = 347903;
        public static final int BatayskMainPostOffice = 346770;
        public static final int BatayskPostOffice1 = 346771;
        public static final int BatayskPostOffice2 = 346772;
        public static final int BatayskPostOffice3 = 346773;
        public static final int VolgodonskMainPostOffice = 343760;
        public static final int VolgodonskPostOffice1 = 343761;
        public static final int VolgodonskPostOffice2 = 343762;
        public static final int VolgodonskPostOffice3 = 343763;
        public static final int AzovMainPostOffice = 346780;
        public static final int AzovPostOffice1 = 346781;
        public static final int AzovPostOffice2 = 346782;
        public static final int AzovPostOffice3 = 346783;
    }
}
