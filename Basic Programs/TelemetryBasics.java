import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//External imports

//Name to display on Driver Hub
@TeleOp(name = "Telemetry Basics")
public class TelemetryBasics extends LinearOpMode {
    //OpMode class (must be same as file name)

    @Override
    public void runOpMode() {
        //Init phase (things that happen before pressing play)
        telemetry.addLine("Initialized");
        telemetry.update();
        //Make "Initialized" ready to show on Driver Hub and update telemetry to actually display it
        //Updating telemetry will remove all lines and data not added in last update unless they are re-added

        waitForStart();

        while (opModeIsActive()) {
            //Main TeleOp loop (run logic that you need to happen multiple times here Ex: Moving wheels)
            telemetry.addData("Ran for", (int)getRuntime() + " seconds");
            telemetry.update();
            //Make the amount of time code has ran display on Driver Hub
        }
    }
}