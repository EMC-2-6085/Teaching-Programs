import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Telemetry Basics")
public class TelemetryBasics extends LinearOpMode {

    @Override
    public void runOpMode() {
        telemetry.addLine("Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Ran for", (int)getRuntime() + " seconds");
            telemetry.update();
        }
    }
}