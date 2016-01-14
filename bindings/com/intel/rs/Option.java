package com.intel.rs;

public enum Option
{
    COLOR_BACKLIGHT_COMPENSATION(0),
    COLOR_BRIGHTNESS(1),
    COLOR_CONTRAST(2),
    COLOR_EXPOSURE(3), // Controls exposure time of color camera. Setting any value will disable auto exposure.
    COLOR_GAIN(4),
    COLOR_GAMMA(5),
    COLOR_HUE(6),
    COLOR_SATURATION(7),
    COLOR_SHARPNESS(8),
    COLOR_WHITE_BALANCE(9), // Controls white balance of color image. Setting any value will disable auto white balance.
    COLOR_ENABLE_AUTO_EXPOSURE(10), // Set to 1 to enable automatic exposure control, or 0 to return to manual control
    COLOR_ENABLE_AUTO_WHITE_BALANCE(11), // Set to 1 to enable automatic white balance control, or 0 to return to manual control
    F200_LASER_POWER(12), // 0 - 15
    F200_ACCURACY(13), // 0 - 3
    F200_MOTION_RANGE(14), // 0 - 100
    F200_FILTER_OPTION(15), // 0 - 7
    F200_CONFIDENCE_THRESHOLD(16), // 0 - 15
    SR300_DYNAMIC_FPS(17), // {2, 5, 15, 30, 60}
    SR300_AUTO_RANGE_ENABLE_MOTION_VERSUS_RANGE(18),
    SR300_AUTO_RANGE_ENABLE_LASER(19),
    SR300_AUTO_RANGE_MIN_MOTION_VERSUS_RANGE(20),
    SR300_AUTO_RANGE_MAX_MOTION_VERSUS_RANGE(21),
    SR300_AUTO_RANGE_START_MOTION_VERSUS_RANGE(22),
    SR300_AUTO_RANGE_MIN_LASER(23),
    SR300_AUTO_RANGE_MAX_LASER(24),
    SR300_AUTO_RANGE_START_LASER(25),
    SR300_AUTO_RANGE_UPPER_THRESHOLD(26),
    SR300_AUTO_RANGE_LOWER_THRESHOLD(27),
    R200_LR_AUTO_EXPOSURE_ENABLED(28), // {0, 1}
    R200_LR_GAIN(29), // 100 - 1600 (Units of 0.01)
    R200_LR_EXPOSURE(30), // > 0 (Units of 0.1 ms)
    R200_EMITTER_ENABLED(31), // {0, 1}
    R200_DEPTH_CONTROL_PRESET(32), // 0 - 5, 0 is default, 1-5 is low to high outlier rejection
    R200_DEPTH_UNITS(33), // micrometers per increment in integer depth values, 1000 is default (mm scale)
    R200_DEPTH_CLAMP_MIN(34), // 0 - USHORT_MAX
    R200_DEPTH_CLAMP_MAX(35), // 0 - USHORT_MAX
    R200_DISPARITY_MULTIPLIER(36), // 0 - 1000, the increments in integer disparity values corresponding to one pixel of disparity
    R200_DISPARITY_SHIFT(37),
    R200_AUTO_EXPOSURE_MEAN_INTENSITY_SET_POINT(38),
    R200_AUTO_EXPOSURE_BRIGHT_RATIO_SET_POINT(39),
    R200_AUTO_EXPOSURE_KP_GAIN(40),
    R200_AUTO_EXPOSURE_KP_EXPOSURE(41),
    R200_AUTO_EXPOSURE_KP_DARK_THRESHOLD(42),
    R200_AUTO_EXPOSURE_EXPOSURE_TOP_EDGE(43),
    R200_AUTO_EXPOSURE_EXPOSURE_BOTTOM_EDGE(44),
    R200_AUTO_EXPOSURE_EXPOSURE_LEFT_EDGE(45),
    R200_AUTO_EXPOSURE_EXPOSURE_RIGHT_EDGE(46),
    R200_DEPTH_CONTROL_ESTIMATE_MEDIAN_DECREMENT(47),
    R200_DEPTH_CONTROL_ESTIMATE_MEDIAN_INCREMENT(48),
    R200_DEPTH_CONTROL_MEDIAN_THRESHOLD(49),
    R200_DEPTH_CONTROL_SCORE_MINIMUM_THRESHOLD(50),
    R200_DEPTH_CONTROL_SCORE_MAXIMUM_THRESHOLD(51),
    R200_DEPTH_CONTROL_TEXTURE_COUNT_THRESHOLD(52),
    R200_DEPTH_CONTROL_TEXTURE_DIFFERENCE_THRESHOLD(53),
    R200_DEPTH_CONTROL_SECOND_PEAK_THRESHOLD(54),
    R200_DEPTH_CONTROL_NEIGHBOR_THRESHOLD(55),
    R200_DEPTH_CONTROL_LR_THRESHOLD(56);
    public final int code;
    private Option(int code) { this.code = code; }
}
