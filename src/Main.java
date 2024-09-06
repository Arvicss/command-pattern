import io.github.arvicss.invoker.CentralHub;
import io.github.arvicss.light.*;
import io.github.arvicss.musicplayer.*;
import io.github.arvicss.thermostat.*;
import io.github.arvicss.tv.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentralHub centralHub = new CentralHub();

        // Light
        Light light = new Light();
        LightSwitchOn lightSwitchOn = new LightSwitchOn(light);
        LightSwitchOff lightSwitchOff = new LightSwitchOff(light);
        LightIncreaseBrightness lightIncreaseBrightness = new LightIncreaseBrightness(light);
        LightDecreaseBrightness lightDecreaseBrightness = new LightDecreaseBrightness(light);

        // Music Player
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerIncreaseVolume musicPlayerIncreaseVolume = new MusicPlayerIncreaseVolume(musicPlayer);
        MusicPlayerDecreaseVolume musicPlayerDecreaseVolume = new MusicPlayerDecreaseVolume(musicPlayer);
        MusicPlayerPlayPlaylist musicPlayerPlayPlaylist = new MusicPlayerPlayPlaylist(musicPlayer);

        // Thermostat
        Thermostat thermostat = new Thermostat();
        ThermostatIncreaseTemp thermostatIncreaseTemp = new ThermostatIncreaseTemp(thermostat);
        ThermostatDecreaseTemp thermostatDecreaseTemp = new ThermostatDecreaseTemp(thermostat);

        // Tv
        Tv tv = new Tv();
        TvSwitchOn tvSwitchOn = new TvSwitchOn(tv);
        TvSwitchOff tvSwitchOff = new TvSwitchOff(tv);

        int applianceSelect = 0;
        int functionSelect = 0;


        do {
            System.out.println("\nSelect the appliance you want to control: ");
            System.out.println("[1] Light");
            System.out.println("[2] Music Player");
            System.out.println("[3] Thermostat");
            System.out.println("[4] Tv");
            System.out.println("[5] Exit!");
            System.out.print("Option: ");

            applianceSelect = scanner.nextInt();

            if(applianceSelect < 1 || applianceSelect > 5) continue;
            if(applianceSelect == 5) break;

            boolean functionStopper = false;
            do {
                switch(applianceSelect) {
                    case 1:
                        // Light
                        System.out.println("\nSelect Functionality: ");
                        System.out.println("[1] Switch On");
                        System.out.println("[2] Switch Off");
                        System.out.println("[3] Increase Brightness");
                        System.out.println("[4] Decrease Brightness");
                        System.out.println("[5] Back");
                        System.out.print("Option: ");

                        functionSelect = scanner.nextInt();
                        if(functionSelect < 1 || functionSelect > 5) continue;

                        switch(functionSelect) {
                            case 1:
                                centralHub.setCommand(lightSwitchOn);
                                centralHub.executeCommand();
                                break;
                            case 2:
                                centralHub.setCommand(lightSwitchOff);
                                centralHub.executeCommand();
                                break;
                            case 3:
                                centralHub.setCommand(lightIncreaseBrightness);
                                centralHub.executeCommand();
                                break;
                            case 4:
                                centralHub.setCommand(lightDecreaseBrightness);
                                centralHub.executeCommand();
                                break;
                            case 5:
                                functionStopper = true;
                                break;
                        }

                        break;
                    case 2:
                        // Music Player
                        System.out.println("\nSelect Functionality: ");
                        System.out.println("[1] Play playlist");
                        System.out.println("[2] Increase Volume");
                        System.out.println("[3] Decrease Volume");
                        System.out.println("[4] Back");
                        System.out.print("Option: ");

                        functionSelect = scanner.nextInt();
                        if(functionSelect < 1 || functionSelect > 4) continue;

                        switch(functionSelect){
                            case 1:
                                centralHub.setCommand(musicPlayerPlayPlaylist);
                                centralHub.executeCommand();
                                break;
                            case 2:
                                centralHub.setCommand(musicPlayerIncreaseVolume);
                                centralHub.executeCommand();
                                break;
                            case 3:
                                centralHub.setCommand(musicPlayerDecreaseVolume);
                                centralHub.executeCommand();
                                break;
                            case 4:
                                functionStopper = true;
                                break;
                        }

                        break;
                    case 3:
                        // Thermostat
                        System.out.println("\nSelect Functionality: ");
                        System.out.println("[1] Increase Temperature");
                        System.out.println("[2] Decrease Temperature");
                        System.out.println("[3] Back!");
                        System.out.print("Option: ");

                        functionSelect = scanner.nextInt();
                        if(functionSelect < 1 || functionSelect > 3) continue;

                        switch(functionSelect){
                            case 1:
                                centralHub.setCommand(thermostatIncreaseTemp);
                                centralHub.executeCommand();
                                break;
                            case 2:
                                centralHub.setCommand(thermostatDecreaseTemp);
                                centralHub.executeCommand();
                                break;
                            case 3:
                                functionStopper = true;
                                break;
                        }

                        break;
                    case 4:
                        // TV
                        System.out.println("\nSelect Functionality: ");
                        System.out.println("[1] Switch On");
                        System.out.println("[2] Switch Off");
                        System.out.println("[3] Back!");
                        System.out.print("Option: ");

                        functionSelect = scanner.nextInt();
                        if(functionSelect < 1 || functionSelect > 3) continue;

                        switch(functionSelect){
                            case 1:
                                centralHub.setCommand(tvSwitchOn);
                                centralHub.executeCommand();
                                break;
                            case 2:
                                centralHub.setCommand(tvSwitchOff);
                                centralHub.executeCommand();
                                break;
                            case 3:
                                functionStopper = true;
                                break;
                        }

                        break;
                }
            } while(!functionStopper);
        } while(true);
    }
}
