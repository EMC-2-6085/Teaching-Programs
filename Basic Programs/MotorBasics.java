import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Motor Basics")
public class MotorBasics extends LinearOpMode {
    DcMotor motor;

    @Override
    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");

	motor.setPower(1);

	telemetry.addLine("Initialising");
	telemetry.addData("Motor Power", motor.getPower());
        telemetry.update();

	sleep(2000);
	motor.setPower(0);

        telemetry.addLine("Initialized");
	telemetry.addData("Motor Power", motor.getPower());
        telemetry.update();

        waitForStart();
	motor.setPower(-1);

        while (opModeIsActive()) {
            telemetry.addData("Ran for", (int)getRuntime() + " seconds");
	    telemetry.addData("Motor Power", motor.getPower());
            telemetry.update();
        }
    }
}