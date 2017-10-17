package com.configautowire.annotations;

public class Radio {
Transmitter transmitter;


public Transmitter getTransmitter() {
	return transmitter;
}


public void setTransmitter(Transmitter transmitter) {
	this.transmitter = transmitter;
}


@Override
public String toString() {
	return "Radio [transmitter=" + transmitter + "]";
}

}
