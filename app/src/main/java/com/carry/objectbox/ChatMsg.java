package com.carry.objectbox;


import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Index;
import lombok.Data;

@Data
@Entity
public class ChatMsg {
    @Index
    public String date;
    public String extMap;
    public String extString;

    @Id
    public long f79934id;
    public int isAck;
    public long localTime;
    public String msgContent;
    @Index
    public String msgId;
    public int msgReceiveStatus;
    public int msgSource;
    @Index
    public int msgStatus;
    public int msgType;
    @Index
    public String quoteMsgId;
    public String receiverId;
    public String senderId;
    @Index
    public long serverTime;
    @Index
    public String sessionId;
    @Index
    public int showType;
    public int snapChat;
    public String text;

}
