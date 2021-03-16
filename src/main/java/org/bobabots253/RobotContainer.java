package org.bobabots253;

public class RobotContainer {
    
    private static RobotContainer instance;
    
    public static RobotContainer getInstance() {
        if (instance == null)
            instance = new RobotContainer();
        return instance;
    }
    
    private RobotContainer() {
        bindOI();
    }
    
    /**
     * Binds operator input to Commands 
     */
    private void bindOI() {
        
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
