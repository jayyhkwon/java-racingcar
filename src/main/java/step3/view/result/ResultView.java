package step3.view.result;

import step3.car.Car;

import java.util.List;

public class ResultView {

    private static final String moveResult = "-";

    public void printTitle() {
        System.out.println("실행 결과");
    }

    public void printGameResult(List<Car> cars) {
        cars.forEach(this::printCarMovedDistance);
        System.out.println();
    }

    private void printCarMovedDistance(Car car) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < car.getMovedDistance(); i++) {
            sb.append(moveResult);
        }
        System.out.println(sb.toString());
    }
}
