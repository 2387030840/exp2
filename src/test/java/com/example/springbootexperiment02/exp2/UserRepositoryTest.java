package com.example.springbootexperiment02.exp2;

import com.example.springbootexperiment02.exp2.entity.Address;
import com.example.springbootexperiment02.exp2.entity.User;
import com.example.springbootexperiment02.exp2.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUserTest(){
        User user = userRepository.addUser(new User("Zhao"));
        log.debug("{}",user.getInsertTime());
        System.out.println(user.getInsertTime());
    }

    @Test
    public void addAddressTest(){
        Address address = userRepository.addAddress(new Address("UK"), 3);
        System.out.println(address.getInsertTime());
    }

    @Test
    public void updateUserTest(){
        User user = userRepository.updateUser(3, "Sun");
        System.out.println(user.getName());
    }

    @Test
    public void updateAddressTest(){
        userRepository.updateAddress(4, 1);

    }

    @Test
    public void listAddressTest(){
        for(Address address : userRepository.listAddresses(1)){
            System.out.println(address.getId()+"|"+address.getDetail());
        }
    }

    @Test
    public void removeAddressTest(){
        userRepository.removeAddress(4);
    }

    @Test
    public void removeUserTest(){
        userRepository.removeUser(2);
    }
}
