package ss7_abstrac_interface.BT.interface_resizeable;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(3);
        System.out.println(square1);
        Square square2 = new Square("red", false, 3);

    }
}
