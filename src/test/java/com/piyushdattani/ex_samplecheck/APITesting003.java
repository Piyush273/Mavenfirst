package com.piyushdattani.ex_samplecheck;

public class APITesting003 {
    public  APITesting003 step1(){
        System.out.println("Step1");
        return this;
    }


    public  APITesting003 step2(){
        System.out.println("Step2");
        return this;
    }


    public  APITesting003 step3(String param){
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
       APITesting003 bp = new APITesting003();
       bp.step1().step2().step3("test");
        //np.step1();
        //np.step2();
        //np.step3("piyush");

    }
}
