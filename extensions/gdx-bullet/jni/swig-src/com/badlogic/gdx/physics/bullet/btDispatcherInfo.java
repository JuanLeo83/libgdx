/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btDispatcherInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btDispatcherInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btDispatcherInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btDispatcherInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btDispatcherInfo() {
    this(gdxBulletJNI.new_btDispatcherInfo(), true);
  }

  public void setM_timeStep(float value) {
    gdxBulletJNI.btDispatcherInfo_m_timeStep_set(swigCPtr, this, value);
  }

  public float getM_timeStep() {
    return gdxBulletJNI.btDispatcherInfo_m_timeStep_get(swigCPtr, this);
  }

  public void setM_stepCount(int value) {
    gdxBulletJNI.btDispatcherInfo_m_stepCount_set(swigCPtr, this, value);
  }

  public int getM_stepCount() {
    return gdxBulletJNI.btDispatcherInfo_m_stepCount_get(swigCPtr, this);
  }

  public void setM_dispatchFunc(int value) {
    gdxBulletJNI.btDispatcherInfo_m_dispatchFunc_set(swigCPtr, this, value);
  }

  public int getM_dispatchFunc() {
    return gdxBulletJNI.btDispatcherInfo_m_dispatchFunc_get(swigCPtr, this);
  }

  public void setM_timeOfImpact(float value) {
    gdxBulletJNI.btDispatcherInfo_m_timeOfImpact_set(swigCPtr, this, value);
  }

  public float getM_timeOfImpact() {
    return gdxBulletJNI.btDispatcherInfo_m_timeOfImpact_get(swigCPtr, this);
  }

  public void setM_useContinuous(boolean value) {
    gdxBulletJNI.btDispatcherInfo_m_useContinuous_set(swigCPtr, this, value);
  }

  public boolean getM_useContinuous() {
    return gdxBulletJNI.btDispatcherInfo_m_useContinuous_get(swigCPtr, this);
  }

  public void setM_debugDraw(btIDebugDraw value) {
    gdxBulletJNI.btDispatcherInfo_m_debugDraw_set(swigCPtr, this, btIDebugDraw.getCPtr(value), value);
  }

  public btIDebugDraw getM_debugDraw() {
    long cPtr = gdxBulletJNI.btDispatcherInfo_m_debugDraw_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btIDebugDraw(cPtr, false);
  }

  public void setM_enableSatConvex(boolean value) {
    gdxBulletJNI.btDispatcherInfo_m_enableSatConvex_set(swigCPtr, this, value);
  }

  public boolean getM_enableSatConvex() {
    return gdxBulletJNI.btDispatcherInfo_m_enableSatConvex_get(swigCPtr, this);
  }

  public void setM_enableSPU(boolean value) {
    gdxBulletJNI.btDispatcherInfo_m_enableSPU_set(swigCPtr, this, value);
  }

  public boolean getM_enableSPU() {
    return gdxBulletJNI.btDispatcherInfo_m_enableSPU_get(swigCPtr, this);
  }

  public void setM_useEpa(boolean value) {
    gdxBulletJNI.btDispatcherInfo_m_useEpa_set(swigCPtr, this, value);
  }

  public boolean getM_useEpa() {
    return gdxBulletJNI.btDispatcherInfo_m_useEpa_get(swigCPtr, this);
  }

  public void setM_allowedCcdPenetration(float value) {
    gdxBulletJNI.btDispatcherInfo_m_allowedCcdPenetration_set(swigCPtr, this, value);
  }

  public float getM_allowedCcdPenetration() {
    return gdxBulletJNI.btDispatcherInfo_m_allowedCcdPenetration_get(swigCPtr, this);
  }

  public void setM_useConvexConservativeDistanceUtil(boolean value) {
    gdxBulletJNI.btDispatcherInfo_m_useConvexConservativeDistanceUtil_set(swigCPtr, this, value);
  }

  public boolean getM_useConvexConservativeDistanceUtil() {
    return gdxBulletJNI.btDispatcherInfo_m_useConvexConservativeDistanceUtil_get(swigCPtr, this);
  }

  public void setM_convexConservativeDistanceThreshold(float value) {
    gdxBulletJNI.btDispatcherInfo_m_convexConservativeDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getM_convexConservativeDistanceThreshold() {
    return gdxBulletJNI.btDispatcherInfo_m_convexConservativeDistanceThreshold_get(swigCPtr, this);
  }

  public void setM_stackAllocator(btStackAlloc value) {
    gdxBulletJNI.btDispatcherInfo_m_stackAllocator_set(swigCPtr, this, btStackAlloc.getCPtr(value), value);
  }

  public btStackAlloc getM_stackAllocator() {
    long cPtr = gdxBulletJNI.btDispatcherInfo_m_stackAllocator_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btStackAlloc(cPtr, false);
  }

  public final static class DispatchFunc {
    public final static int DISPATCH_DISCRETE = 1;
    public final static int DISPATCH_CONTINUOUS = DISPATCH_DISCRETE + 1;
  }

}
