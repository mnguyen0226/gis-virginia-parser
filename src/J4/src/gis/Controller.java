// On my honor:

//
// - I have not discussed the Java language code in my program with
// anyone other than my instructor or the teaching assistants
// assigned to this course.
//
// - I have not used Java language code obtained from another student,
// or any other unauthorized source, including the Internet, either
// modified or unmodified.
//
// - If any Java language code or documentation used in my program
// was obtained from another source, such as a text book or course
// notes, that has been clearly noted with a proper citation in
// the comments of my program.
//
// - I have not designed this program in such a way as to defeat or
// interfere with the normal operation of the supplied grading code.
//
// Minh T. Nguyen
// mnguyen0226
package gis;

import java.util.ArrayList;
import gis.objectmodel.Command;
import gis.*;

// Class that start and execute the entire GIS program
public class Controller {
    // CONSTRUCTORS

    /**
     * Create a new Controller object. This will create a list of commands, then
     * initialize a CommandProcessor instance to process all commands.
     *
     *
     * @param databaseFileName      The name of the database file
     * @param commandScriptFileName The name of the command script file
     * @param logFileName           The name of the log file
     */
    public Controller(String dbFileName, String scriptFileName, String logFileName) {
        ArrayList<Command> commandList = CommandParser.getCommands(scriptFileName);

        if (commandList != null) {
            new CommandProcessor(commandList, dbFileName, scriptFileName, logFileName);
        }
    }

}
