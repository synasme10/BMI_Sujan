package com.example.bmi_sujan;

class Bmi_Sujan {
    public double h,w,result;

    public Bmi_Sujan(double h,double w){
        this.h=h;
        this.w=w;
    }

    public double calculate(){
        result=w/(h/100*h/100);
        return result;
    }

    public String BMICat(){
        if (result<18.5){
            return "Underweight";
        }
        else if(result>18.5 && result<24.9){
            return "Normal Weight";

        }
        else if(result>25 && result<29.9){
            return "Overweight";
        }
        else{
            return "Obesity";

        }
    }
}
