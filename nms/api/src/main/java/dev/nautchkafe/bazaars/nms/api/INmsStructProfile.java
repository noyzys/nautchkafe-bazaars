package dev.nautchkafe.bazaars.nms.api;

import dev.nautchkafe.bazaars.nms.api.structure.INmsModifier;
import dev.nautchkafe.bazaars.nms.api.structure.packet.IPacketCallback;

/**
 * @author: noyzys on 18:40, 10.07.2021
 **/
public interface INmsStructProfile
{
    void profileTrait(final INmsModifier modifier);

    void handlePacketCallback(final IPacketCallback packetCallback);
}
