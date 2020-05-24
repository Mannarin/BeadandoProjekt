package model;

public class BMICalculator {

   //private int age;
    private String weight;
    private String height;

    public BMICalculator() {
    }

    public String calculateBMI(String weight, String height) {
        return Double.toString(Integer.parseInt(weight)/((Double.parseDouble(height)/100)*(Double.parseDouble(height)/100)));

    }

   /* public String chartBMI(String age, String bmi) {
            int ageInt = Integer.parseInt(age);
            int bmiInt = Integer.parseInt(bmi);
            String info = "";
            if (ageInt >= 18 && ageInt <= 24) {
                if (bmiInt < 19) {
                    info = "Your in the skinny category.";
                } else if (bmiInt >= 19 && bmiInt <= 24) {
                    info = "You have the ideal body mass.";
                } else if (bmiInt >= 24 && bmiInt <= 29) {
                    info = "You have some fat to work on.";
                } else if (bmiInt >= 29 && bmiInt <= 39) {
                    info = "You are in the obese category.";
                } else if (bmiInt > 39) {
                    info = "You are in drastical obesity.";
                }
            } else if (ageInt >= 25 && ageInt <= 34) {
                if (bmiInt < 20) {
                    info = "Your in the skinny category.";
                } else if (bmiInt >= 20 && bmiInt <= 25) {
                    info = "You have the ideal body mass.";
                } else if (bmiInt >= 25 && bmiInt <= 30) {
                    info = "You have some fat to work on.";
                } else if (bmiInt >= 30 && bmiInt <= 40) {
                    info = "You are in the obese category.";
                } else if (bmiInt > 40) {
                    info = "You are in drastical obesity.";
                }
            } else if (ageInt >= 35 && ageInt <= 44) {
                if (bmiInt < 21) {
                    info = "Your in the skinny category.";
                } else if (bmiInt >= 21 && bmiInt <= 26) {
                    info = "You have the ideal body mass.";
                } else if (bmiInt >= 26 && bmiInt <= 31) {
                    info = "You have some fat to work on.";
                } else if (bmiInt >= 31 && bmiInt <= 41) {
                    info = "You are in the obese category.";
                } else if (bmiInt > 41) {
                    info = "You are in drastical obesity.";
                }
            } else if (ageInt >= 45 && ageInt <= 54) {
                if (bmiInt < 22) {
                    info = "Your in the skinny category.";
                } else if (bmiInt >= 22 && bmiInt <= 27) {
                    info = "You have the ideal body mass.";
                } else if (bmiInt >= 27 && bmiInt <= 32) {
                    info = "You have some fat to work on.";
                } else if (bmiInt >= 32 && bmiInt <= 42) {
                    info = "You are in the obese category.";
                } else if (bmiInt > 42) {
                    info = "You are in drastical obesity.";
                }
            } else if (ageInt >= 55 && ageInt <= 64) {
                if (bmiInt < 23) {
                    info = "Your in the skinny category.";
                } else if (bmiInt >= 23 && bmiInt <= 28) {
                    info = "You have the ideal body mass.";
                } else if (bmiInt >= 28 && bmiInt <= 33) {
                    info = "You have some fat to work on.";
                } else if (bmiInt >= 33 && bmiInt <= 43) {
                    info = "You are in the obese category.";
                } else if (bmiInt > 43) {
                    info = "You are in drastical obesity.";
                }
            } else if (ageInt > 65 && ageInt <= 120) {
                if (bmiInt < 24) {
                    info = "Your in the skinny category.";
                } else if (bmiInt >= 24 && bmiInt <= 29) {
                    info = "You have the ideal body mass.";
                } else if (bmiInt >= 29 && bmiInt <= 34) {
                    info = "You have some fat to work on.";
                } else if (bmiInt >= 34 && bmiInt <= 44) {
                    info = "You are in the obese category.";
                } else if (bmiInt > 44) {
                    info = "You are in drastical obesity.";
                }

            } else if (!(ageInt >= 18) && !(ageInt <= 120)) {
                return "Your age is not between 18 and 120.";
            }
        return info;
    }*/
}
