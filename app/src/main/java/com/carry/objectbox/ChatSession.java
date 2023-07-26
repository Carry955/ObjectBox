package com.carry.objectbox;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Index;
import lombok.Data;

@Data
@Entity
public class ChatSession {
    public int chatType;
    public String extIno;

    @Id(assignable = true)
    public long id;
    public String lastMsgText = "";
    public int msgStatus;
    public String sessionId;
    public long timestamp;
    public String toUserId;
    public long unReadCount;
    @Index
    public String userId;
}
