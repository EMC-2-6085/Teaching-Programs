import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//External imports

//Name to display on Driver Hub
@TeleOp(name = "TeleOp Basics")
public class TeleOpBasics extends LinearOpMode {
    //OpMode class (must be same as file name)

    @Override
    public void runOpMode() {
        //Init phase (things that happen before pressing play)

        waitForStart();

        while (opModeIsActive()) {
            //Main TeleOp loop (run logic that you need to happen multiple times here Ex: Moving wheels)
            
        }
    }
}  