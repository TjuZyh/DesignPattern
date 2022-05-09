package exe4.test5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyh
 * @Date 2022/5/7 4:20 下午
 * @Version 1.0
 */
public class TravelTotalSystem implements Mediator{
    private AirportSystem airportSystem;
    private TravelSystem travelSystem;
    private HotelSystem hotelSystem;
    private List<String> nameList = new ArrayList<>();

    public TravelTotalSystem() {
        createColleagues();
    }

    @Override
    public void createColleagues() {
        airportSystem = new AirportSystem();
        travelSystem = new TravelSystem();
        hotelSystem = new HotelSystem();

        airportSystem.setMediator(this);
        travelSystem.setMediator(this);
        hotelSystem.setMediator(this);

        String info1 = airportSystem.returnUSerInfo();
        String info2 = travelSystem.returnUSerInfo();
        String info3 = hotelSystem.returnUSerInfo();
        nameList.add(info1);
        nameList.add(info2);
        nameList.add(info3);
    }

    @Override
    public List<String> shareUserInfo() {
        System.out.println("消息已经分享给其他模块");
        for(String str : nameList){
            System.out.println(str);
        }
        return nameList;
    }
}
