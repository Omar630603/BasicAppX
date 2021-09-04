package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }
    public void setInch(double inch) {
        this.meter = inch/39.3701;
    }
    public void setMile(double mile) {
        this.meter = mile/0.000621371;
    }
    public void setFoot(double foot) {
        this.meter = foot/3.28084;
    }
    public double getMeter() {
        return meter;
    }
    public double getInch() {
        return this.meter*39.3701;
    }
    public double getMile(){
        return this.meter*0.000621371;
    }
    public double getFoot(){
        return this.meter*3.28084;
    }
    public double convert(String oriUnit, String convUnit, double value){
        //Meter
        if(oriUnit.equalsIgnoreCase("Mtr") && convUnit.equalsIgnoreCase("Mtr")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("Mtr") && convUnit.equalsIgnoreCase("Inc")){
            setMeter(value);
            return this.getInch();
        }
        if(oriUnit.equalsIgnoreCase("Mtr") && convUnit.equalsIgnoreCase("Mil")){
            setMeter(value);
            return this.getMile();
        }
        if(oriUnit.equalsIgnoreCase("Mtr") && convUnit.equalsIgnoreCase("Ft")){
            setMeter(value);
            return this.getFoot();
        }
        //Inch
        if(oriUnit.equalsIgnoreCase("Inc") && convUnit.equalsIgnoreCase("Mtr")){
            setInch(value);
            return this.getMeter();
        }
        if(oriUnit.equalsIgnoreCase("Inc") && convUnit.equalsIgnoreCase("Inc")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("Inc") && convUnit.equalsIgnoreCase("Mil")){
            setInch(value);
            return this.getMile();
        }
        if(oriUnit.equalsIgnoreCase("Inc") && convUnit.equalsIgnoreCase("Ft")){
            setInch(value);
            return this.getFoot();
        }
        //Mile
        if(oriUnit.equalsIgnoreCase("Mil") && convUnit.equalsIgnoreCase("Mtr")){
            setMile(value);
            return this.getMeter();
        }
        if(oriUnit.equalsIgnoreCase("Mil") && convUnit.equalsIgnoreCase("Inc")){
            setMile(value);
            return this.getInch();
        }
        if(oriUnit.equalsIgnoreCase("Mil") && convUnit.equalsIgnoreCase("Mil")){
            return value;
        }
        if(oriUnit.equalsIgnoreCase("Mil") && convUnit.equalsIgnoreCase("Ft")){
            setMile(value);
            return this.getFoot();
        }
        //Foot
        if(oriUnit.equalsIgnoreCase("Ft") && convUnit.equalsIgnoreCase("Mtr")){
            setFoot(value);
            return this.getMeter();
        }
        if(oriUnit.equalsIgnoreCase("Ft") && convUnit.equalsIgnoreCase("Inc")){
            setFoot(value);
            return this.getInch();
        }
        if(oriUnit.equalsIgnoreCase("Ft") && convUnit.equalsIgnoreCase("Mil")){
            setFoot(value);
            return this.getMile();
        }
        if(oriUnit.equalsIgnoreCase("Ft") && convUnit.equalsIgnoreCase("Ft")){
            return value;
        }
        return 0;
    }
}
