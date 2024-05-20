package com.wavesenterprise.contract.app;

import com.wavesenterprise.contract.api.*;
import com.wavesenterprise.contract.domain.User;
import com.wavesenterprise.contract.domain.UserRole;
import com.wavesenterprise.sdk.contract.api.annotation.ContractHandler;
import com.wavesenterprise.sdk.contract.api.domain.ContractCall;
import com.wavesenterprise.sdk.contract.api.state.ContractState;
import com.wavesenterprise.sdk.contract.api.state.mapping.Mapping;

import static com.wavesenterprise.contract.api.IContract.Keys.*;

@ContractHandler
public class Contract implements IContract {
    private final ContractState contractState;
    private final ContractCall call;
    private final Mapping<User> userMapping;

    public Contract(ContractState contractState, ContractCall call) {
        this.contractState = contractState;
        this.call = call;
        this.userMapping = contractState.getMapping(User.class, USER_MAPPING_PREFIX);
    }

    @Override
    public void init() {
        userMapping.put(call.getCaller(), new User("Семенов Семен Семенович", null, UserRole.ADMIN, 0));
    }
}
