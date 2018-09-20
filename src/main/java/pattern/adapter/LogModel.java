package pattern.adapter;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by lby on 9/7/2018.
 */
@Data
@Builder
public class LogModel implements Serializable{
    private String logId;
    private String operUser;
    private String operTime;

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operUser='" + operUser + '\'' +
                ", operTime='" + operTime + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    private String content;
}
