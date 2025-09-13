import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
    @Test
    public void testThatWhenIBoughtTheBikeTheEngineIsOff(){
        AutomaticBike bike = new AutomaticBike();
        boolean result = bike.getIgnation();
        assertFalse(result);
    }
    @Test
    public void testWhenITurnIgnationItOnWhenIOffBikeOff(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        boolean result  = bike.getIgnation();
        assertTrue(result);
        bike.setIgnation();
        boolean result2 = bike.getIgnation();
        assertFalse(result2);

    }
    @Test
    public void testWhenIBoughtMyBikeTheAccleartionIsAtZero(){
        AutomaticBike bike = new AutomaticBike();
        int result = bike.getAcceleration();
        assertEquals(0, result);
    }
    @Test
    public void testWhenICanOnlyAcelerateIfMyEgineIsOn(){
        AutomaticBike bike = new AutomaticBike();
        bike.setAcceleration();
        int result = bike.getAcceleration();
        assertEquals(0, result);
    }
    @Test
    public void testWhenIamInaccerlrationRangeof1to20AccelerationOnlyIncreaseByOne(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setAcceleration();
        bike.setAcceleration();
        int result = bike.getAcceleration();
        assertEquals(2, result);
    }
    @Test
    public void testWhenAmInRangeof20to30ItIncreaseBytwo(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(24);
        bike.setAcceleration();
        int result = bike.getAcceleration();
        assertEquals(26, result);
    }
    @Test
    public void testWhenAmInRangeof30to40ItIncreaseBythree(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(35);
        bike.setAcceleration();
        int result = bike.getAcceleration();
        assertEquals(38, result);
    }
    @Test
    public void testWhenAmInRangeof30UpwardsItIncreaseByfour(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(44);
        bike.setAcceleration();
        int result = bike.getAcceleration();
        assertEquals(48, result);
    }
    @Test
    public void testWhenTheISwitchOffTheEngineTheAccelerationGoesBackToZero(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(44);
        bike.setIgnation(); //switchOff
        bike.setIgnation();//SwitchOn
        int result = bike.getAcceleration();
        assertEquals(0, result);
    }
    @Test
    public void testWhenTheEngineIsOnICanDecelerate(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setAcceleration();
        bike.setDeceleration();
        int result = bike.getAcceleration();
        assertEquals(0, result);
    }
    @Test
    public void testWhenAccelerationIsAtZeroAndIKeepOnDecelerating(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setDeceleration();
        bike.setDeceleration();
        int result = bike.getAcceleration();
        assertEquals(0,result);
    }
    @Test
    public void testWhenITheAccelerationIsBetweenRange1to20ItDecelerateByOne(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(15); //current Accleration
        bike.setDeceleration();
        int result = bike.getAcceleration();
        assertEquals(14, result);

    }
    @Test
    public  void testWhenTheAcceleartionIsBetweenRange20to3oitDeclerateBytwo(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(25);
        bike.setDeceleration();
        int result = bike.getAcceleration();
        assertEquals(23, result);
    }
    @Test
    public void testWhenTheAccelerationIsBetweenRange30to40ItDeclerateBythree(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(38);
        bike.setDeceleration();
        int result = bike.getAcceleration();
        assertEquals(35, result);
    }
    @Test
    public void testwhenTheAccelerationIs40aboveItDeclerateByfour(){
        AutomaticBike bike = new AutomaticBike();
        bike.setIgnation();
        bike.setSpeed(44);
        bike.setDeceleration();
        int result = bike.getAcceleration();
        assertEquals(40,result);
    }







}