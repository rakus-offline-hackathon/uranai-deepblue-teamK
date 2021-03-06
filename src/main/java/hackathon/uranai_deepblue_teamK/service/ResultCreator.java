package hackathon.uranai_deepblue_teamK.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aya on 2016/07/24.
 */
@Service
public class ResultCreator {

    private final List<String> starList;

    public ResultCreator() {
        this.starList = Arrays.asList(
                "☆☆☆☆☆",
                "★☆☆☆☆",
                "★★☆☆☆",
                "★★★☆☆",
                "★★★★☆",
                "★★★★★"
        );
    }
    public String createImagePath(int result) {
        return String.valueOf(result).length() > 1 ?
                "/img/0" + result + ".gif" : "/img/00" + result + ".gif";
    }

    public List<String> createStarResult(int result, LocalDateTime dateTime) {
        List<String> resultList = new ArrayList<>();
        resultList.add(starList.get(calc(result, dateTime.getDayOfMonth())));
        resultList.add(starList.get(calc(result, dateTime.getHour())));
        resultList.add(starList.get(calc(result, dateTime.getMinute())));
        return resultList;
    }

    private int calc(int result, int param) {
        return (result + param) % 6;
    }

}
