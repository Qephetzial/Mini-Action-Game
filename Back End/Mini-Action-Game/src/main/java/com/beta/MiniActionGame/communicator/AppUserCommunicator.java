package com.beta.MiniActionGame.communicator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class AppUserCommunicator {
    private UUID uuid;
    private int gold;
    private List<UUID> heroesId;
    private List<String> heroesTypes;
}
