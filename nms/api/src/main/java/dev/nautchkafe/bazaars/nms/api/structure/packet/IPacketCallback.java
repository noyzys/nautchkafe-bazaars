package dev.nautchkafe.bazaars.nms.api.structure.packet;

import dev.nautchkafe.bazaars.nms.api.INmsStructProfile;

/**
 * @author: noyzys on 18:35, 10.07.2021
 **/
@FunctionalInterface
public interface IPacketCallback
{
    void inlinedCallback(final INmsStructProfile structProfile);
}
