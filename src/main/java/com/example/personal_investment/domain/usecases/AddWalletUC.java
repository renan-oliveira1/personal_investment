package com.example.personal_investment.domain.usecases;


import com.example.personal_investment.domain.entities.user.User;
import com.example.personal_investment.domain.entities.wallet.Wallet;
import com.example.personal_investment.domain.interfaces.IWalletRepository;
import com.example.personal_investment.domain.utils.Validator;

public class AddWalletUC {
    private final IWalletRepository walletRepository;

    public AddWalletUC(IWalletRepository walletRepository){
        this.walletRepository = walletRepository;
    }

    public void insert(User user, Wallet wallet){
        Validator.validateWallet(wallet);


        walletRepository.insert(wallet);
    }
}
