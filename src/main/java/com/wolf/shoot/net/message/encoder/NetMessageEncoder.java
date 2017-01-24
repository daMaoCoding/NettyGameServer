package com.wolf.shoot.net.message.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.CharsetUtil;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by jwp on 2017/1/24.
 */
public class NetMessageEncoder extends MessageToMessageDecoder<ByteBuf> {

    private final Charset charset;

    public NetMessageEncoder() {
        this(CharsetUtil.UTF_8);
    }

    public NetMessageEncoder(Charset charset) {
        if(charset == null) {
            throw new NullPointerException("charset");
        } else {
            this.charset = charset;
        }
    }

    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
//        out.add(msg.toString(this.charset));

    }
}
