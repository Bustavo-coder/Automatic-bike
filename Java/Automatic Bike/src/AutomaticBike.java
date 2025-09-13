public class AutomaticBike {
    private boolean ignation;
   private  int gear;
   private int acceleration;
    public boolean getIgnation(){
        return ignation;
    }

    public void setIgnation() {
        if(!ignation){
            ignation = true;
        }
        else{
            ignation = false;
            acceleration = 0;
        }
    }
     public void setGear(){
         if (ignation) {
             if (acceleration >= 0 && acceleration <= 20) {
                 this.gear = 1;
             } else if (acceleration > 20 && acceleration <= 30) {
                 this.gear = 2;
             } else if (acceleration > 30 && acceleration <= 40) {
                 this.gear = 3;
             } else {
                 this.gear = 4;
             }
         }
     }

    public void setAcceleration(){
        if(ignation) {
            setGear();
            acceleration += gear;
        }
    }
    public void setSpeed(int speed) {
        if(ignation) {
            this.acceleration = speed;
        }
        }
    public void setDeceleration() {
        if(ignation) {
            if(acceleration >= 0) {
                setGear();
                acceleration -= gear;
            }else {
                acceleration = 0;
            }
        }
    }

    public int getAcceleration() {
        return acceleration;
    }

}
