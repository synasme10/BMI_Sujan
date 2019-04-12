package com.example.bmi_sujan;

import java.text.DecimalFormat;

class Bmi_Sujan {
    public float h,w,result,roundbmi;

    public Bmi_Sujan(float h,float w){
        this.h=h;
        this.w=w;
    }

    public float calculate(){

        result=w/(h*h);
        roundbmi= (float) (Math.round(result*10)/10.0);
        return roundbmi;
    }

    public String BMICat(){
        if (roundbmi<18.5){
            return "Underweight";
        }
        else if(roundbmi>18.5 && roundbmi<24.9){
            return "Normal Weight";

        }
        else if(roundbmi>25 && roundbmi<29.9){
            return "Overweight";
        }
        else{
            return "Obesity";

        }
    }
}
