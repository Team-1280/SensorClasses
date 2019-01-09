# Sensor Classes
###### Contains classes for the following sensors:
- Push Button Sensor
     - Boolean
- Ultrasonic Sensor
    - Double (Floating Point)
    - Outputs distance in inches
    - Requires UltrasonicSensor.setInchesPerVolt(inchesPerVolt) to work, when in doubt do 8.5
    - Different than WPILib's Analog Sensor
- Hall Effect Sensor
    - Boolean
    - Detects Magnet
- RightSight Industrial Sensor
    - Boolean
    - Diffuses light and outputs signal if any light returns to the housing
    - 500mm range, *appears to be* 5-degree FOV
    - Does not measure distance, only object presence within ranging area
