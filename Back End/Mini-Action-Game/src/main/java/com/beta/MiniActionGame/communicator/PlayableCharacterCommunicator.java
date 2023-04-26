package com.beta.MiniActionGame.communicator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class PlayableCharacterCommunicator {
    private List<UUID> uuids;
    private List<String> conditions;
    private List<String> types;
}
