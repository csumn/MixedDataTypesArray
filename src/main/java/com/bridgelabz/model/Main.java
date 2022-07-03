package com.bridgelabz.model;

import com.bridgelabz.service.Service;
import com.bridgelabz.serviceImpl.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        Service serviceImpl = new ServiceImpl();
        serviceImpl.intArray();
        serviceImpl.stringArray();
        serviceImpl.booleanArray();
        serviceImpl.doubleArray();
        serviceImpl.characterArray();
        serviceImpl.longArray();
    }
}
