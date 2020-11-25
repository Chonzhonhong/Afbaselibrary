package com.czh.mytest.particleflow;

import android.content.res.Resources;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;

/**
 * @Created By Admin  on 2020/11/25
 * @Email : 163235610@qq.com
 * @Author:Mrczh
 * @Instructions:
 */
public class ScriptC_particleflow  extends ScriptC {
    private static final String __rs_resource_name = "particleflow";
    // Constructor
    public  ScriptC_particleflow(RenderScript rs) {
        this(rs,
                rs.getApplicationContext().getResources(),
                rs.getApplicationContext().getResources().getIdentifier(
                        __rs_resource_name, "raw",
                        rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_particleflow(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        mExportVar_width = 100.f;
        mExportVar_height = 100.f;
    }

    private Element __F32;
    private Element __I32;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_slowHue = 0;
    private float mExportVar_slowHue;
    public synchronized void set_slowHue(float v) {
        setVar(mExportVarIdx_slowHue, v);
        mExportVar_slowHue = v;
    }

    public float get_slowHue() {
        return mExportVar_slowHue;
    }

    public Script.FieldID getFieldID_slowHue() {
        return createFieldID(mExportVarIdx_slowHue, null);
    }

    private final static int mExportVarIdx_slowSaturation = 1;
    private float mExportVar_slowSaturation;
    public synchronized void set_slowSaturation(float v) {
        setVar(mExportVarIdx_slowSaturation, v);
        mExportVar_slowSaturation = v;
    }

    public float get_slowSaturation() {
        return mExportVar_slowSaturation;
    }

    public Script.FieldID getFieldID_slowSaturation() {
        return createFieldID(mExportVarIdx_slowSaturation, null);
    }

    private final static int mExportVarIdx_slowValue = 2;
    private float mExportVar_slowValue;
    public synchronized void set_slowValue(float v) {
        setVar(mExportVarIdx_slowValue, v);
        mExportVar_slowValue = v;
    }

    public float get_slowValue() {
        return mExportVar_slowValue;
    }

    public Script.FieldID getFieldID_slowValue() {
        return createFieldID(mExportVarIdx_slowValue, null);
    }

    private final static int mExportVarIdx_fastHue = 3;
    private float mExportVar_fastHue;
    public synchronized void set_fastHue(float v) {
        setVar(mExportVarIdx_fastHue, v);
        mExportVar_fastHue = v;
    }

    public float get_fastHue() {
        return mExportVar_fastHue;
    }

    public Script.FieldID getFieldID_fastHue() {
        return createFieldID(mExportVarIdx_fastHue, null);
    }

    private final static int mExportVarIdx_fastSaturation = 4;
    private float mExportVar_fastSaturation;
    public synchronized void set_fastSaturation(float v) {
        setVar(mExportVarIdx_fastSaturation, v);
        mExportVar_fastSaturation = v;
    }

    public float get_fastSaturation() {
        return mExportVar_fastSaturation;
    }

    public Script.FieldID getFieldID_fastSaturation() {
        return createFieldID(mExportVarIdx_fastSaturation, null);
    }

    private final static int mExportVarIdx_fastValue = 5;
    private float mExportVar_fastValue;
    public synchronized void set_fastValue(float v) {
        setVar(mExportVarIdx_fastValue, v);
        mExportVar_fastValue = v;
    }

    public float get_fastValue() {
        return mExportVar_fastValue;
    }

    public Script.FieldID getFieldID_fastValue() {
        return createFieldID(mExportVarIdx_fastValue, null);
    }

    private final static int mExportVarIdx_hueDirection = 6;
    private int mExportVar_hueDirection;
    public synchronized void set_hueDirection(int v) {
        setVar(mExportVarIdx_hueDirection, v);
        mExportVar_hueDirection = v;
    }

    public int get_hueDirection() {
        return mExportVar_hueDirection;
    }

    public Script.FieldID getFieldID_hueDirection() {
        return createFieldID(mExportVarIdx_hueDirection, null);
    }

    private final static int mExportVarIdx_f01AttractionCoef = 7;
    private float mExportVar_f01AttractionCoef;
    public synchronized void set_f01AttractionCoef(float v) {
        setVar(mExportVarIdx_f01AttractionCoef, v);
        mExportVar_f01AttractionCoef = v;
    }

    public float get_f01AttractionCoef() {
        return mExportVar_f01AttractionCoef;
    }

    public Script.FieldID getFieldID_f01AttractionCoef() {
        return createFieldID(mExportVarIdx_f01AttractionCoef, null);
    }

    private final static int mExportVarIdx_f01DragCoef = 8;
    private float mExportVar_f01DragCoef;
    public synchronized void set_f01DragCoef(float v) {
        setVar(mExportVarIdx_f01DragCoef, v);
        mExportVar_f01DragCoef = v;
    }

    public float get_f01DragCoef() {
        return mExportVar_f01DragCoef;
    }

    public Script.FieldID getFieldID_f01DragCoef() {
        return createFieldID(mExportVarIdx_f01DragCoef, null);
    }

    private final static int mExportVarIdx_width = 9;
    private float mExportVar_width;
    public synchronized void set_width(float v) {
        setVar(mExportVarIdx_width, v);
        mExportVar_width = v;
    }

    public float get_width() {
        return mExportVar_width;
    }

    public Script.FieldID getFieldID_width() {
        return createFieldID(mExportVarIdx_width, null);
    }

    private final static int mExportVarIdx_height = 10;
    private float mExportVar_height;
    public synchronized void set_height(float v) {
        setVar(mExportVarIdx_height, v);
        mExportVar_height = v;
    }

    public float get_height() {
        return mExportVar_height;
    }

    public Script.FieldID getFieldID_height() {
        return createFieldID(mExportVarIdx_height, null);
    }

    private final static int mExportVarIdx_gTouch = 11;
    private Allocation mExportVar_gTouch;
    public void bind_gTouch(Allocation v) {
        mExportVar_gTouch = v;
        if (v == null) bindAllocation(null, mExportVarIdx_gTouch);
        else bindAllocation(v, mExportVarIdx_gTouch);
    }

    public Allocation get_gTouch() {
        return mExportVar_gTouch;
    }

    private final static int mExportVarIdx_position = 12;
    private Allocation mExportVar_position;
    public void bind_position(Allocation v) {
        mExportVar_position = v;
        if (v == null) bindAllocation(null, mExportVarIdx_position);
        else bindAllocation(v, mExportVarIdx_position);
    }

    public Allocation get_position() {
        return mExportVar_position;
    }

    private final static int mExportVarIdx_delta = 13;
    private Allocation mExportVar_delta;
    public void bind_delta(Allocation v) {
        mExportVar_delta = v;
        if (v == null) bindAllocation(null, mExportVarIdx_delta);
        else bindAllocation(v, mExportVarIdx_delta);
    }

    public Allocation get_delta() {
        return mExportVar_delta;
    }

    private final static int mExportVarIdx_color = 14;
    private Allocation mExportVar_color;
    public void bind_color(Allocation v) {
        mExportVar_color = v;
        if (v == null) bindAllocation(null, mExportVarIdx_color);
        else bindAllocation(v, mExportVarIdx_color);
    }

    public Allocation get_color() {
        return mExportVar_color;
    }

//    private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_updateParticles = 1;
    public Script.KernelID getKernelID_updateParticles() {
        return createKernelID(mExportForEachIdx_updateParticles, 33, null, null);
    }

    public void forEach_updateParticles(Allocation ain) {
//        forEach_updateParticles(ain, null);
        getKernelID_updateParticles();
    }


    public void forEach_updateParticles(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
//        forEach(mExportForEachIdx_updateParticles, ain, null, null, sc);
    }

    private final static int mExportFuncIdx_initParticles = 0;
    public void invoke_initParticles() {
        invoke(mExportFuncIdx_initParticles);
    }

}


