package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.BillingAccount;
import com.netcracker.edu.backend.entity.Serv;
import com.netcracker.edu.backend.entity.User;
import com.netcracker.edu.backend.entity.Wallet;
import com.netcracker.edu.backend.service.ServService;
import com.netcracker.edu.backend.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Mock
    private UserController userController;
    @Mock
    private UserService userService;
    @Mock
    private ServService servService;

    @Test
    public void writeOffMoney() {
        userController = new UserController(userService, servService);
        Assert.assertEquals(20, userController.writeOffMoney(createUser(), createService()));
    }

    private Serv createService() {
        Serv serv = new Serv();
        serv.setPrice(100);
        return serv;
    }

    private User createUser() {
        User user = new User();
        BillingAccount billingAccount = new BillingAccount();
        Wallet wallet = new Wallet();
        wallet.setAmount(120);
        billingAccount.setWallet(wallet);
        user.setBa_Id(billingAccount);
        return user;
    }
}