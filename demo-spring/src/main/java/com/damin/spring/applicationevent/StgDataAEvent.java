package com.damin.spring.applicationevent;

public class StgDataAEvent extends StgEvent {

    private StgDataA stgDataA;

    public StgDataAEvent(StgDataA stgDataA) {
        this.stgDataA = stgDataA;
    }

    public StgDataA getStgDataA() {
        return stgDataA;
    }

    public void setStgDataA(StgDataA stgDataA) {
        this.stgDataA = stgDataA;
    }
}
