# Sensor Classes
##### Contains classes for the following sensors:
- Push Button Sensor
     - Boolean
- Ultrasonic Sensor
    - Double (Floating Point)
    - Outputs distance in Centimeters
    - Constructor has (port, cmPerVolt) where cmPerVolt is the number of Centimeters (cm) in every volt output
    - It appears to be 2V per Centimeter so just make a constant (final) for that
    - Different than WPILib's Analog Sensor
    - Check [MaxBotix documentation](https://www.maxbotix.com/Ultrasonic_Sensors/MB1013.htm "Model 1013 Ultrasonic Sensor Documentation") for more information
- Hall Effect Sensor
    - Boolean
    - Detects Magnet
- RightSight Industrial Sensor
    - Boolean
    - Diffuses light and outputs signal if any light returns to the housing
    - 500mm range, *appears to be* 5-degree FOV
    - *Seems* to not need retro-reflective material to detect object presence but it probably helps
    - Does not measure distance, only object presence within ranging area