package homework2.computer.edu.tekwill.academy.computer;

import homework2.computer.edu.tekwill.academy.computer.components.HardDrive;
import homework2.computer.edu.tekwill.academy.computer.components.Motherboard;
import homework2.computer.edu.tekwill.academy.computer.components.Processor;
import homework2.computer.edu.tekwill.academy.computer.peripherals.Keyboard;
import homework2.computer.edu.tekwill.academy.computer.peripherals.Monitor;
import homework2.computer.edu.tekwill.academy.computer.peripherals.Mouse;

public class Computer {
    Processor processor = new Processor();
    Motherboard motherboard = new Motherboard();
    HardDrive hardDrive = new HardDrive();

    Keyboard keyboard = new Keyboard();
    Monitor monitor = new Monitor();
    Mouse mouse = new Mouse();
}
