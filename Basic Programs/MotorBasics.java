import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//Import DcMotor (required to use motors)

@TeleOp(name = "Motor Basics")
public class MotorBasics extends LinearOpMode {
    DcMotor motor;
    //Make a new DcMotor with the name "motor"

    @Override
    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");
        //Define that the port DcMotor "motor" is on using the config made on the Driver Hub (name at the end must match the config)

	motor.setPower(1);
        //Start motor at 100% power

	telemetry.addLine("Initialising");
	telemetry.addData("Motor Power", motor.getPower());
        telemetry.update();
        //Make "Initialising" and motor power (1) display on Driver Hub
        //Updating telemetry will remove all lines and data not added in last update unless they are re-added

	sleep(2000);
        //Wait 2 seconds
	motor.setPower(0);
        //Stop the motor

        telemetry.addLine("Initialized");
	telemetry.addData("Motor Power", motor.getPower());
        telemetry.update();
        //Make "Initialized" and motor power (0) display on Driver Hub

        waitForStart();
        //Wait for when the play button is pressed (pressed twice)
	motor.setPower(-1);
        //Set motor to move in opposite direction
        while (opModeIsActive()) {
            telemetry.addData("Ran for", (int)getRuntime() + " seconds");
	    telemetry.addData("Motor Power", motor.getPower());
            telemetry.update();
            //Display how long the program has ran and motor power (-1)
        }
    }
}