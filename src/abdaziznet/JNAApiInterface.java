package abdaziznet;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface JNAApiInterface extends Library {
    //@SuppressWarnings("deprecation")
    final String MATH_DLL = "C:\\05-Labs\\08-c++\\MyMath\\x64\\Release\\MyMath.dll";
    final JNAApiInterface INSTANCE = (JNAApiInterface) Native.load(MATH_DLL, JNAApiInterface.class);

    float Add(float a, float b);

    float Sub(float a, float b);

    float Mul(float a, float b);

    float Dev(float a, float b);

}
