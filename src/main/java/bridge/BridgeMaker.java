package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {

    public static final int UP = 1;
    public static final int INITIAL_INDEX = 0;
    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     * @test 입력받은 숫자 길이만큼 다리를 생성하는 지 테스트한다.
     */
    public List<String> makeBridge(int size) {
        return null;
    }

    private void appendBridge(List<String> bridge) {
        if (bridgeNumberGenerator.generate() == UP) {
            bridge.add("U");
            return;
        }
        bridge.add("D");
    }
}
