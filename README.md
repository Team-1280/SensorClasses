# Sensor Classes
###### Contains classes for the following sensors:
- Push Button Sensor
     - Boolean
- Ultrasonic Sensor
    - Double (Floating Point)
    - Outputs distance in inches
    - Needs to be rewired to fit centimeters
    - Constructor has (port, inchesPerVolt) where inchesPerVolt is the amount of inches in one volt output
    - It appears to be 2V per Centimeter so just make a constant for that
    - Different than WPILib's Analog Sensor
    - Check MaxBotix documentation for the 1013 model mounted on a black PCB
- Hall Effect Sensor
    - Boolean
    - Detects Magnet
- RightSight Industrial Sensor
    - Boolean
    - Diffuses light and outputs signal if any light returns to the housing
    - 500mm range, *appears to be* 5-degree FOV
    - *Seems* to not need retro-reflective material to detect object presence but it probably helps
    - Does not measure distance, only object presence within ranging area