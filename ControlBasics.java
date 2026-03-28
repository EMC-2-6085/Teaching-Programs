import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//Import DcMotor (required to use motors)

@TeleOp(name = "Control Basics")
public class ControlBasics extends LinearOpMode {
    DcMotor motor;
    //Make a new DcMotor with the name "motor"
    double power;
    //Make a variable to store the power of the motor

    @Override
    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");
        //Define that the port DcMotor "motor" is on using the config made on the Driver Hub (name at the end must match the config)

	    telemetry.addLine("Initialized");
        telemetry.update();
        //Make "Initialized" display on Driver Hub

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.dpad_up) {
                power = .5;
                //Set power to .5 if dpad_up is pressed on gamepad 1
            } else {
                power = gamepad1.left_stick_y;
                //Set power to the value of the left stick of gamepad 1 if dpad_up is not pressed(-1.0 to 1.0)
            }

            motor.setPower(power);
            //Set motor power to the value of power

            telemetry.addData("Ran for", (int)getRuntime() + " seconds");
	        telemetry.addData("Motor Power", motor.getPower());
            telemetry.update();
            //Display how long the program has ran and motor power
        }
    }
}