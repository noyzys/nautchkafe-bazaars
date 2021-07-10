package dev.nautchkafe.bazaars.nms.api.structure.packet;

/**
 * @author: noyzys on 18:35, 10.07.2021
 **/
interface IPacketReactorCallback<IN, OUT>
{
    // RESULT later Monad..
    IN modify(final OUT out);
}
