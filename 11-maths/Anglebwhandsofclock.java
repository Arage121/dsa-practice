//https://leetcode.com/problems/angle-between-hands-of-a-clock/
public class Anglebwhandsofclock {
    public double angleClock(int hour, int minutes) {
        int totalMinutes=hour*60+minutes;
        double hourAngle=totalMinutes*0.5;
        double minuteAngle=minutes*6;
        if(hourAngle>=360){
            hourAngle=hourAngle-360;
        }
        double ans=Math.abs(minuteAngle-hourAngle);
        if(ans>180.00){
            ans=360.00-ans;
        }
        return ans;
    }
}