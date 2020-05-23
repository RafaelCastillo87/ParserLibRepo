package com.verizon.logmgmt.model.data.qc.logrecord.ml;


import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_18;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_18_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_18_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_18_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_18_SR_15301_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_22;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_22_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_22_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_22_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_22_SR_15305_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_22_SR_15967_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_24;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_24_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_24_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_24_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_24_SR_15306_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_24_SR_15881_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_35;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_35_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_35_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_35_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_35_SR_15310_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_35_SR_15315_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_36;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_36_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_36_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_36_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_36_SR_36173_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_36_SR_36176_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39_SR_103611_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39_SR_103649_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_39_ENUMERATION_103771_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_40;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_40_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_40_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_40_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_40_SR_41072_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_40_SR_41075_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_41;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_41_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_41_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_41_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_41_SR_88177_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_41_SR_88214_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_42;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_42_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_42_SR_100453_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_42_SR_100516_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_42_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_42_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_48;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_48_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_48_SR_12422_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_48_SR_12447_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_48_SR_100238_DTO;
import com.vzwdt.DNLPLTE_ph3.Dynamic_45459_48_SR_100301_DTO;
import com.vzwdt.parseutils.ParseUtils;
import com.verizon.logmgmt.model.base.TimeSeriesDataModel;
import com.verizon.logmgmt.model.data.DataModelContainer;
import com.verizon.logmgmt.model.data.LteMeasurements;
import com.verizon.logmgmt.model.data.qc.logrecord.QcLogRecord;
import com.verizon.logmgmt.model.impl.BandIndicatorLastServingDataModel;
import com.verizon.logmgmt.model.impl.BandIndicatorNewServingDataModel;
import com.verizon.logmgmt.model.impl.BandIndicatorTimeDataModel;
import com.verizon.logmgmt.model.impl.DlEarfcnLastServingDataModel;
import com.verizon.logmgmt.model.impl.DlEarfcnNewServingDataModel;
import com.verizon.logmgmt.model.impl.LTELastServingCellRSRPDataTimeModel;
import com.verizon.logmgmt.model.impl.LTELastServingCellRSRQDataTimeModel;
import com.verizon.logmgmt.model.impl.LTELastServingCellRSSIDataTimeModel;
import com.verizon.logmgmt.model.impl.LTELastServingPCIDataTimeModel;
import com.verizon.logmgmt.model.impl.LTEMobilityPCIDataTimeModel;
import com.verizon.logmgmt.model.impl.LTENewServingCellRSRPDataTimeModel;
import com.verizon.logmgmt.model.impl.LTENewServingCellRSRQDataTimeModel;
import com.verizon.logmgmt.model.impl.LTENewServingCellRSSIDataTimeModel;
import com.verizon.logmgmt.model.impl.LTENewServingPCIDataTimeModel;
import com.verizon.logmgmt.model.impl.RSRPDataModel;
import com.verizon.logmgmt.model.impl.RSRPRx0DataModel;
import com.verizon.logmgmt.model.impl.RSRPRx1DataModel;
import com.verizon.logmgmt.model.impl.RSRPRx2DataModel;
import com.verizon.logmgmt.model.impl.RSRPRx3DataModel;
import com.verizon.logmgmt.model.impl.RSRQDataModel;
import com.verizon.logmgmt.model.impl.RSRQRx0DataModel;
import com.verizon.logmgmt.model.impl.RSRQRx1DataModel;
import com.verizon.logmgmt.model.impl.RSRQRx2DataModel;
import com.verizon.logmgmt.model.impl.RSRQRx3DataModel;
import com.verizon.logmgmt.model.impl.RSSIDataModel;
import com.verizon.logmgmt.model.impl.RSSIRx0DataModel;
import com.verizon.logmgmt.model.impl.RSSIRx1DataModel;
import com.verizon.logmgmt.model.impl.RSSIRx2DataModel;
import com.verizon.logmgmt.model.impl.RSSIRx3DataModel;
import com.verizon.logmgmt.model.impl.SINRDataModel;
import com.verizon.logmgmt.model.impl.SINRRx0DataModel;
import com.verizon.logmgmt.model.impl.SINRRx1DataModel;
import com.verizon.logmgmt.model.impl.SINRRx2DataModel;
import com.verizon.logmgmt.model.impl.SINRRx3DataModel;
import com.verizon.logmgmt.util.ParseMain;
import com.wits.common.logging.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import static com.verizon.logmgmt.util.ParseMain.CBRS_BAND;
import static com.verizon.logmgmt.util.ParseMain.CBRS_BAND_STR;
import static com.verizon.logmgmt.util.ParseMain.LAA_BAND;
import static com.verizon.logmgmt.util.ParseMain.LAA_BAND_STR;
import static com.verizon.logmgmt.util.ParseMain.SCC_SAMPLE_RATE;

public class ML1ServingCellMeasurementResultLogRecord extends QcLogRecord {

    private static final int TYPE = 0xB193;
    private static final String DESCRIPTION = "LTE ML1 Serving Cell Measurement Result";

    public int version;
    public int subPacketId;
    public int subPacketVersion;
    private Dynamic_45459_18_DTO mDynamic_45459_18_DTO;
    private Dynamic_45459_22_DTO mDynamic_45459_22_DTO;
    private Dynamic_45459_24_DTO mDynamic_45459_24_DTO;
    private Dynamic_45459_35_DTO mDynamic_45459_35_DTO;
    private Dynamic_45459_36_DTO mDynamic_45459_36_DTO;
    private Dynamic_45459_39_DTO mDynamic_45459_39_DTO;
    private Dynamic_45459_40_DTO mDynamic_45459_40_DTO;
    private Dynamic_45459_41_DTO mDynamic_45459_41_DTO;
    private Dynamic_45459_42_DTO mDynamic_45459_42_DTO;
    private Dynamic_45459_48_DTO mDynamic_45459_48_DTO;

    public ML1ServingCellMeasurementResultLogRecord() {
        super();
    }

    @Override
    public void parse(byte[] b) {
        version = ParseUtils.intFromByte(b[12]);
        subPacketId = ParseUtils.intFromByte(b[16]);
        subPacketVersion = ParseUtils.intFromByte(b[17]);
        switch (version) {
            case 1:
                switch (subPacketId) {
                    case 25:
                        switch (subPacketVersion) {
                            case 18:
                                Dynamic_45459_18 mDynamic_45459_18 = new Dynamic_45459_18();
                                Dynamic_45459_18.DynamicLogRecord mDynamic_45459_18_Record = mDynamic_45459_18.getDynamicLogRecord();
                                mDynamic_45459_18_Record.InternalParse(b);
                                mDynamic_45459_18_DTO = mDynamic_45459_18_Record.getBean();
                                break;
                            case 22:
                                Dynamic_45459_22 mDynamic_45459_22 = new Dynamic_45459_22();
                                Dynamic_45459_22.DynamicLogRecord mDynamic_45459_22_Record = mDynamic_45459_22.getDynamicLogRecord();
                                mDynamic_45459_22_Record.InternalParse(b);
                                mDynamic_45459_22_DTO = mDynamic_45459_22_Record.getBean();
                                break;
                            case 24:
                                Dynamic_45459_24 mDynamic_45459_24 = new Dynamic_45459_24();
                                Dynamic_45459_24.DynamicLogRecord mDynamic_45459_24_Record = mDynamic_45459_24.getDynamicLogRecord();
                                mDynamic_45459_24_Record.InternalParse(b);
                                mDynamic_45459_24_DTO = mDynamic_45459_24_Record.getBean();
                                break;
                            case 35:
                                Dynamic_45459_35 mDynamic_45459_35 = new Dynamic_45459_35();
                                Dynamic_45459_35.DynamicLogRecord mDynamic_45459_35_Record = mDynamic_45459_35.getDynamicLogRecord();
                                mDynamic_45459_35_Record.InternalParse(b);
                                mDynamic_45459_35_DTO = mDynamic_45459_35_Record.getBean();
                                break;
                            case 36:
                                Dynamic_45459_36 mDynamic_45459_36 = new Dynamic_45459_36();
                                Dynamic_45459_36.DynamicLogRecord mDynamic_45459_36_Record = mDynamic_45459_36.getDynamicLogRecord();
                                mDynamic_45459_36_Record.InternalParse(b);
                                mDynamic_45459_36_DTO = mDynamic_45459_36_Record.getBean();
                                break;
                            case 39:
                                Dynamic_45459_39 mDynamic_45459_39 = new Dynamic_45459_39();
                                Dynamic_45459_39.DynamicLogRecord mDynamic_45459_39_Record = mDynamic_45459_39.getDynamicLogRecord();
                                mDynamic_45459_39_Record.InternalParse(b);
                                mDynamic_45459_39_DTO = mDynamic_45459_39_Record.getBean();
                                break;
                            case 40:
                                Dynamic_45459_40 mDynamic_45459_40 = new Dynamic_45459_40();
                                Dynamic_45459_40.DynamicLogRecord mDynamic_45459_40_Record = mDynamic_45459_40.getDynamicLogRecord();
                                mDynamic_45459_40_Record.InternalParse(b);
                                mDynamic_45459_40_DTO = mDynamic_45459_40_Record.getBean();
                                break;
                            case 41:
                                Dynamic_45459_41 mDynamic_45459_41 = new Dynamic_45459_41();
                                Dynamic_45459_41.DynamicLogRecord mDynamic_45459_41_Record = mDynamic_45459_41.getDynamicLogRecord();
                                mDynamic_45459_41_Record.InternalParse(b);
                                mDynamic_45459_41_DTO = mDynamic_45459_41_Record.getBean();
                                break;
                            case 42:
                                Dynamic_45459_42 mDynamic_45459_42 = new Dynamic_45459_42();
                                Dynamic_45459_42.DynamicLogRecord mDynamic_45459_42_Record = mDynamic_45459_42.getDynamicLogRecord();
                                mDynamic_45459_42_Record.InternalParse(b);
                                mDynamic_45459_42_DTO = mDynamic_45459_42_Record.getBean();
                                break;
                            case 48:
                                Dynamic_45459_48 mDynamic_45459_48 = new Dynamic_45459_48();
                                Dynamic_45459_48.DynamicLogRecord mDynamic_45459_48_Record = mDynamic_45459_48.getDynamicLogRecord();
                                mDynamic_45459_48_Record.InternalParse(b);
                                mDynamic_45459_48_DTO = mDynamic_45459_48_Record.getBean();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }

    @Override
    public void applyData(DataModelContainer data) {
        Date time = getTimestamp();
        long currentTime = time.getTime();
        double instSinr = -100.0;

        RSRPDataModel rsrpModel = data.getRSRPDataModel();
        RSRPRx0DataModel rsrpRx0Model = data.getRSRPRx0DataModel();
        RSRPRx1DataModel rsrpRx1Model = data.getRSRPRx1DataModel();
        RSRQDataModel rsrqModel = data.getRSRQDataModel();
        RSRQRx0DataModel rsrqRx0Model = data.getRSRQRx0DataModel();
        RSRQRx1DataModel rsrqRx1Model = data.getRSRQRx1DataModel();
        RSSIDataModel rssiModel = data.getRSSIDataModel();
        RSSIRx0DataModel rssiRx0Model = data.getRSSIRx0DataModel();
        RSSIRx1DataModel rssiRx1Model = data.getRSSIRx1DataModel();
        SINRDataModel sinrModel = data.getSINRDataModel();
        SINRRx0DataModel sinrRx0Model = data.getSINRRx0DataModel();
        SINRRx1DataModel sinrRx1Model = data.getSINRRx1DataModel();

        rsrpRx0Model.setLastRecordTime(time);

        LTELastServingPCIDataTimeModel lastPciDM = data.getLTELastServingPCIDataTimeModel();
        LTELastServingCellRSRPDataTimeModel lastRsrpDM = data.getLTELastServingCellRSRPDataTimeModel();
        LTELastServingCellRSRQDataTimeModel lastRsrqDM = data.getLTELastServingCellRSRQDataTimeModel();
        LTELastServingCellRSSIDataTimeModel lastRssiDM = data.getLTELastServingCellRSSIDataTimeModel();
        BandIndicatorLastServingDataModel lastbandIndicatorDM = data.getBandIndicatorLastServingDataModel();
        DlEarfcnLastServingDataModel lastEarfcnDM = data.getDlEarfcnLastServingDataModel();

        LTENewServingPCIDataTimeModel currentPciDM = data.getLTENewServingPCIDataTimeModel();
        LTENewServingCellRSRPDataTimeModel currentRsrpDM = data.getLTENewServingCellRSRPDataTimeModel();
        LTENewServingCellRSRQDataTimeModel currentRsrqDM = data.getLTENewServingCellRSRQDataTimeModel();
        LTENewServingCellRSSIDataTimeModel currentRssiDM = data.getLTENewServingCellRSSIDataTimeModel();
        DlEarfcnNewServingDataModel currentEarfcnDM = data.getDlEarfcnNewServingDataModel();
        BandIndicatorNewServingDataModel currentBandIndicatorDM = data.getBandIndicatorNewServingDataModel();

        RSRPRx2DataModel rsrpRx2Model = data.getRSRPRx2DataModel();
        RSRPRx3DataModel rsrpRx3Model = data.getRSRPRx3DataModel();
        RSRQRx2DataModel rsrqRx2Model = data.getRSRQRx2DataModel();
        RSRQRx3DataModel rsrqRx3Model = data.getRSRQRx3DataModel();
        RSSIRx2DataModel rssiRx2Model = data.getRSSIRx2DataModel();
        RSSIRx3DataModel rssiRx3Model = data.getRSSIRx3DataModel();
        SINRRx2DataModel sinrRx2Model = data.getSINRRx2DataModel();
        SINRRx3DataModel sinrRx3Model = data.getSINRRx3DataModel();

        switch (version) {
            case 1:
                switch (subPacketId) {
                    case 25:
                        switch (subPacketVersion) {
                            case 18:
                                for (Dynamic_45459_18_SR_12422_DTO r : mDynamic_45459_18_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_18_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_18_SR_15301_DTO i1 : i0.getSr_15301_inst_list()) {

                                            if (Double.parseDouble(i1.getSINRRx0()) > Double.parseDouble(i1.getSINRRx1()))
                                                instSinr = Double.parseDouble(i1.getSINRRx0());
                                            else
                                                instSinr = Double.parseDouble(i1.getSINRRx1());

                                            data.getLTEValidRxConfigDataModel().addValueEvent("RX0_RX1", 1);
                                            switch (i1.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {

                                                        data.lastTimePCC = time.getTime();
                                                        //int pCCBand = ParseUtils.getBandIndicator(i1.getEARFCN());


                                                        String cellName = i1.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i1.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));


                                                        String ServingCellInfo = i1.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();

                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i1.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i1.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i1.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i1.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);

                                                        } else {
                                                            //currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }
                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());
                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i1.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i1.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i1.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i1.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i1.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i1.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {

                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }

                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i1.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i1.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i1.getInstRSSI()));

                                                        rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i1.getInstRSRPRx0()));
                                                        rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i1.getInstRSRPRx1()));
                                                        rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i1.getInstRSRQRx0()));
                                                        rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i1.getInstRSRQRx1()));
                                                        rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i1.getInstRSSIRx0()));
                                                        rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i1.getInstRSSIRx1()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }
                                                        sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i1.getSINRRx0()));
                                                        sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i1.getSINRRx1()));

                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 22:
                                for (Dynamic_45459_22_SR_12422_DTO r : mDynamic_45459_22_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_22_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {
                                        for (Dynamic_45459_22_SR_15305_DTO i1 : i0.getSr_15305_inst_list()) {
                                            {
                                                Dynamic_45459_22_SR_15967_DTO i2 = i1.getSr_15967_inst_list().get(0);

                                                switch (i2.getServingCellIndex().toLowerCase()) {
                                                    case "pcell":
                                                        if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                            data.lastTimePCC = time.getTime();

                                                            String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                            data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                            data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                            int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                            List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                            servingMeasModel.add(rsrpModel);
                                                            servingMeasModel.add(rsrqModel);
                                                            servingMeasModel.add(rssiModel);

                                                            String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                            String currentPCI = currentPciDM.getLastPoint();
                                                            //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                            ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                            if (currentPCI.equals("-")) {

                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                                addNewServingCell(servingMeasModel, ServingCellInfo);
                                                            } else {
                                                                String lastEarfcn = currentEarfcnDM.getLatest();
                                                                String lastCellRSRP = rsrpModel.getLastPoint();
                                                                String lastCellRSRQ = rsrqModel.getLastPoint();
                                                                String lastCellRSSI = rssiModel.getLastPoint();
                                                                String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                                //Remove floating point from PCI
                                                                if (currentPCI.length() > 2) {
                                                                    currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                                }
                                                                String cellNameDM = "";
                                                                if (!lastEarfcn.equals("-")) {
                                                                    cellNameDM = currentPCI + "/" + lastEarfcn;
                                                                }

                                                                if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                    //Save last Serving cell values at handover
                                                                    try {
                                                                        lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                        lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                        lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                        lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                    } catch (Exception ex) {
                                                                        Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                    }

                                                                    lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                    lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                    //clear previous handover Neighbor cell info
                                                                    data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                    //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                                    for (String key : measSet.keySet()) {

                                                                        LteMeasurements measObj = measSet.get(key);

                                                                        data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());
                                                                    }

                                                                    //Save new Serving cell values at handover
                                                                    currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                    currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                    currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                    currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                    currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                    currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                    addNewServingCell(servingMeasModel, ServingCellInfo);
                                                                }
                                                            }

                                                            LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                            mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                            data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                            data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                            if (pCCBand != -1) {
                                                                if (pCCBand == LAA_BAND) {
                                                                    data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                                } else if (pCCBand == CBRS_BAND) {
                                                                    data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                                } else {
                                                                    data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                                }
                                                                data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                                data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                            }

                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > Double.parseDouble(i2.getFTLSNRRx1()))
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            else
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));

                                                            if (Integer.parseInt(i1.getHorxdmode()) != 0) {

                                                                if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                    instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                                if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                    instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                                data.getLTEValidRxConfigDataModel().addValueEvent("RX0_RX1_RX2_RX3", 1);
                                                                rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                                rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                                rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                                rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                                rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                                rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                                sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                                sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                            } else {
                                                                data.getLTEValidRxConfigDataModel().addValueEvent("RX0_RX1", 1);
                                                            }

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);
                                                            rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
//                                                    if (instSinr != -100.0) {
//                                                        sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
//                                                    }

                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 24:
                                for (Dynamic_45459_24_SR_12422_DTO r : mDynamic_45459_24_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_24_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {
                                        for (Dynamic_45459_24_SR_15306_DTO i1 : i0.getSr_15306_inst_list()) {
                                            {
                                                Dynamic_45459_24_SR_15881_DTO i2 = i1.getSr_15881_inst_list().get(0);

                                                switch (i2.getServingCellIndex().toLowerCase()) {
                                                    case "pcell":
                                                        if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                            data.lastTimePCC = time.getTime();

                                                            String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                            data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                            data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                            int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                            List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                            servingMeasModel.add(rsrpModel);
                                                            servingMeasModel.add(rsrqModel);
                                                            servingMeasModel.add(rssiModel);

                                                            String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                            String currentPCI = currentPciDM.getLastPoint();
                                                            //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                            ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                            if (currentPCI.equals("-")) {

                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                                addNewServingCell(servingMeasModel, ServingCellInfo);
                                                            } else {
                                                                String lastEarfcn = currentEarfcnDM.getLatest();
                                                                String lastCellRSRP = rsrpModel.getLastPoint();
                                                                String lastCellRSRQ = rsrqModel.getLastPoint();
                                                                String lastCellRSSI = rssiModel.getLastPoint();
                                                                String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                                //Remove floating point from PCI
                                                                if (currentPCI.length() > 2) {
                                                                    currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                                }
                                                                String cellNameDM = "";
                                                                if (!lastEarfcn.equals("-")) {
                                                                    cellNameDM = currentPCI + "/" + lastEarfcn;
                                                                }

                                                                if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                    //Save last Serving cell values at handover
                                                                    try {
                                                                        lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                        lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                        lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                        lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                    } catch (Exception ex) {
                                                                        Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                    }

                                                                    lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                    lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                    //clear previous handover Neighbor cell info
                                                                    data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                    //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                                    for (String key : measSet.keySet()) {

                                                                        LteMeasurements measObj = measSet.get(key);

                                                                        data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());
                                                                    }

                                                                    //Save new Serving cell values at handover
                                                                    currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                    currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                    currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                    currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                    currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                    currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                    addNewServingCell(servingMeasModel, ServingCellInfo);
                                                                }
                                                            }

                                                            LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                            mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                            data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                            data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                            if (pCCBand != -1) {
                                                                if (pCCBand == LAA_BAND) {
                                                                    data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                                } else if (pCCBand == CBRS_BAND) {
                                                                    data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                                } else {
                                                                    data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                                }
                                                                data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                                data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                            }

                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > Double.parseDouble(i2.getFTLSNRRx1()))
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            else
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));

                                                                data.getLTEValidRxConfigDataModel().addValueEvent("RX0_RX1", 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);
                                                            rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
//                                                    if (instSinr != -100.0) {
//                                                        sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
//                                                    }

                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 35:
                                for (Dynamic_45459_35_SR_12422_DTO r : mDynamic_45459_35_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_35_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_35_SR_15310_DTO i1 : i0.getSr_15310_inst_list()) {
                                            Dynamic_45459_35_SR_15315_DTO i2 = i1.getSr_15315_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }

                                }
                                break;
                            case 36:
                                for (Dynamic_45459_36_SR_12422_DTO r : mDynamic_45459_36_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_36_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_36_SR_36173_DTO i1 : i0.getSr_36173_inst_list()) {
                                            Dynamic_45459_36_SR_36176_DTO i2 = i1.getSr_36176_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));;

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 39:
                                for (Dynamic_45459_39_SR_12422_DTO r : mDynamic_45459_39_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_39_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_39_SR_103611_DTO i1 : i0.getSr_103611_inst_list()) {
                                            Dynamic_45459_39_SR_103649_DTO i2 = i1.getSr_103649_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));;

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 40:
                                for (Dynamic_45459_40_SR_12422_DTO r : mDynamic_45459_40_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_40_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_40_SR_41072_DTO i1 : i0.getSr_41072_inst_list()) {
                                            Dynamic_45459_40_SR_41075_DTO i2 = i1.getSr_41075_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 41:
                                for (Dynamic_45459_41_SR_12422_DTO r : mDynamic_45459_41_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_41_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_41_SR_88177_DTO i1 : i0.getSr_88177_inst_list()) {
                                            Dynamic_45459_41_SR_88214_DTO i2 = i1.getSr_88214_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;

                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                                //******************************************************************//
                            case 42:
                                for (Dynamic_45459_42_SR_12422_DTO r : mDynamic_45459_42_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_42_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_42_SR_100453_DTO i1 : i0.getSr_100453_inst_list()) {
                                            Dynamic_45459_42_SR_100516_DTO i2 = i1.getSr_100516_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 48:
                                for (Dynamic_45459_48_SR_12422_DTO r : mDynamic_45459_48_DTO.getSr_12422_inst_list()) {
                                    for (Dynamic_45459_48_SR_12447_DTO i0 : r.getSr_12447_inst_list()) {

                                        for (Dynamic_45459_48_SR_100238_DTO i1 : i0.getSr_100238_inst_list()) {
                                            Dynamic_45459_48_SR_100301_DTO i2 = i1.getSr_100301_inst_list().get(0);

                                            switch (i2.getServingCellIndex().toLowerCase()) {
                                                case "pcell":
                                                    if (currentTime >= data.lastTimePCC + ParseMain.PCC_SAMPLE_RATE) {
                                                        data.lastTimePCC = time.getTime();

                                                        String cellName = i2.getPhysicalCellID() + "/" + i1.getEARFCN();
                                                        data.getPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);
                                                        int pCCBand = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        List<TimeSeriesDataModel> servingMeasModel = new ArrayList<>();
                                                        servingMeasModel.add(rsrpModel);
                                                        servingMeasModel.add(rsrqModel);
                                                        servingMeasModel.add(rssiModel);

                                                        String ServingCellInfo = i2.getPhysicalCellID() + "/" + i1.getEARFCN() + "/" + pCCBand;

                                                        String currentPCI = currentPciDM.getLastPoint();
                                                        //Save neighbor cell values at handover. Due to async access to series, work with copy
                                                        ConcurrentHashMap<String, LteMeasurements> measSet = data.getNeighborMeasurementDataModel().getMeasurementSetCopy();
                                                        if (currentPCI.equals("-")) {

                                                            currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                            currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                            currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                            currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                            currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                            currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);

                                                            addNewServingCell(servingMeasModel, ServingCellInfo);


                                                        } else {
                                                            String lastEarfcn = currentEarfcnDM.getLatest();
                                                            String lastCellRSRP = rsrpModel.getLastPoint();
                                                            String lastCellRSRQ = rsrqModel.getLastPoint();
                                                            String lastCellRSSI = rssiModel.getLastPoint();
                                                            String lastBandIndicator = currentBandIndicatorDM.getLatest();

                                                            //Remove floating point from PCI
                                                            if (currentPCI.length() > 2) {
                                                                currentPCI = currentPCI.substring(0, (currentPCI.length() - 2));
                                                            }
                                                            String cellNameDM = "";
                                                            if (!lastEarfcn.equals("-")) {
                                                                cellNameDM = currentPCI + "/" + lastEarfcn;
                                                            }

                                                            if (!cellNameDM.isEmpty() && !cellNameDM.equals(cellName)) {

                                                                //Save last Serving cell values at handover
                                                                try {
                                                                    lastPciDM.addPointToSeries(lastPciDM.getSeriesName(), lastPciDM.getOffset(time), Double.parseDouble(currentPCI));
                                                                    lastRsrpDM.addPointToSeries(lastRsrpDM.getSeriesName(), lastRsrpDM.getOffset(time), Double.parseDouble(lastCellRSRP));
                                                                    lastRsrqDM.addPointToSeries(lastRsrqDM.getSeriesName(), lastRsrqDM.getOffset(time), Double.parseDouble(lastCellRSRQ));
                                                                    lastRssiDM.addPointToSeries(lastRssiDM.getSeriesName(), lastRssiDM.getOffset(time), Double.parseDouble(lastCellRSSI));
                                                                } catch (Exception ex) {
                                                                    Logger.enteringSpec("Error: ParserDouble: " + "time: " + time + "; cellNameDM= " + cellNameDM + "; cellName= " + cellName + "; lastCellRSRP= " + lastCellRSRP + "; lastCellRSRQ =" + lastCellRSRQ + "; lastCellRSSI= " + lastCellRSSI);
                                                                }

                                                                lastEarfcnDM.addValueEvent(lastEarfcn, 1);
                                                                lastbandIndicatorDM.addValueEvent(lastBandIndicator, 1);

                                                                //clear previous handover Neighbor cell info
                                                                data.getNeighborMeasurementAtHoDataModel().clearValueEvent();

                                                                //Save neighbor cell values at handover. Due to async access to series, work with copy

                                                                for (String key : measSet.keySet()) {

                                                                    LteMeasurements measObj = measSet.get(key);

                                                                    data.getNeighborMeasurementAtHoDataModel().addValueEvent(key, measObj.getRSRP(), measObj.getRSRQ(), measObj.getRSSI());

                                                                }

                                                                //Save new Serving cell values at handover
                                                                currentPciDM.addPointToSeries(currentPciDM.getSeriesName(), currentPciDM.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));
                                                                currentRsrpDM.addPointToSeries(currentRsrpDM.getSeriesName(), currentRsrpDM.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                                currentRsrqDM.addPointToSeries(currentRsrqDM.getSeriesName(), currentRsrqDM.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                                currentRssiDM.addPointToSeries(currentRssiDM.getSeriesName(), currentRssiDM.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                                currentEarfcnDM.addValueEvent("" + i1.getEARFCN(), 1);
                                                                currentBandIndicatorDM.addValueEvent("" + pCCBand, 1);
                                                                addNewServingCell(servingMeasModel, ServingCellInfo);

                                                            }
                                                        }

                                                        LTEMobilityPCIDataTimeModel mobilityPCI = data.getLTEMobilityPCIDataTimeModel();
                                                        mobilityPCI.addPointToSeries(mobilityPCI.getSeriesName(), mobilityPCI.getOffset(time), Double.parseDouble(i2.getPhysicalCellID()));

                                                        data.getPccPCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getPccDlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        if (pCCBand != -1) {
                                                            if (pCCBand == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + LAA_BAND_STR;
                                                            } else if (pCCBand == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().pCCBandInd = "" + pCCBand;
                                                            }
                                                            data.getBandIndicatorDataModel().addValueEvent("" + pCCBand, 1);
                                                            data.getBandIndicatorTimeDataModel().addPointToSeries(BandIndicatorTimeDataModel.SERIES_NAME, data.getBandIndicatorTimeDataModel().getOffset(time), pCCBand);
                                                        }
                                                        data.getLTEValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());

                                                            rsrpRx0Model.addPointToSeries(RSRPRx0DataModel.SERIES_NAME, rsrpRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx0()));
                                                            rsrqRx0Model.addPointToSeries(RSRQRx0DataModel.SERIES_NAME, rsrqRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx0()));
                                                            rssiRx0Model.addPointToSeries(RSSIRx0DataModel.SERIES_NAME, rssiRx0Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx0()));
                                                            sinrRx0Model.addPointToSeries(SINRRx0DataModel.SERIES_NAME, sinrRx0Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx0()));
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());

                                                            rssiRx1Model.addPointToSeries(RSSIRx1DataModel.SERIES_NAME, rssiRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx1()));
                                                            rsrpRx1Model.addPointToSeries(RSRPRx1DataModel.SERIES_NAME, rsrpRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx1()));
                                                            rsrqRx1Model.addPointToSeries(RSRQRx1DataModel.SERIES_NAME, rsrqRx1Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx1()));
                                                            sinrRx1Model.addPointToSeries(SINRRx1DataModel.SERIES_NAME, sinrRx1Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx1()));
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());

                                                            rsrpRx2Model.addPointToSeries(RSRPRx2DataModel.SERIES_NAME, rsrpRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx2()));
                                                            rsrqRx2Model.addPointToSeries(RSRQRx2DataModel.SERIES_NAME, rsrqRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx2()));
                                                            rssiRx2Model.addPointToSeries(RSSIRx2DataModel.SERIES_NAME, rssiRx2Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx2()));
                                                            sinrRx2Model.addPointToSeries(SINRRx2DataModel.SERIES_NAME, sinrRx2Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx2()));
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());

                                                            rsrpRx3Model.addPointToSeries(RSRPRx3DataModel.SERIES_NAME, rsrpRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRPRx3()));
                                                            rsrqRx3Model.addPointToSeries(RSRQRx3DataModel.SERIES_NAME, rsrqRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSRQRx3()));
                                                            rssiRx3Model.addPointToSeries(RSSIRx3DataModel.SERIES_NAME, rssiRx3Model.getOffset(time), Double.parseDouble(i2.getInstRSSIRx3()));
                                                            sinrRx3Model.addPointToSeries(SINRRx3DataModel.SERIES_NAME, sinrRx3Model.getOffset(time), Double.parseDouble(i2.getFTLSNRRx3()));
                                                        }

                                                        addNewServingCell(servingMeasModel, ServingCellInfo);
                                                        rsrpModel.addPointToSeries(ServingCellInfo, rsrpModel.getOffset(time), Double.parseDouble(i2.getInstMeasuredRSRP()));
                                                        rsrqModel.addPointToSeries(ServingCellInfo, rsrqModel.getOffset(time), Double.parseDouble(i2.getInstRSRQ()));
                                                        rssiModel.addPointToSeries(ServingCellInfo, rssiModel.getOffset(time), Double.parseDouble(i2.getInstRSSI()));
                                                        if (instSinr != -100.0) {
                                                            sinrModel.addPointToSeries(SINRDataModel.SERIES_NAME, sinrModel.getOffset(time), instSinr);
                                                        }

                                                    }
                                                    break;
                                                case "scc1":
                                                    if (currentTime >= data.lastTimeSCC1 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC1 = time.getTime();
                                                        String sCC1CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC1DlbandWidth = data.getDlBandwidthInfo(sCC1CellInfoKey);

                                                        String sCC1UlFreq = data.getUlFreqInfo(sCC1CellInfoKey);
                                                        String sCC1UlbandWidth = data.getUlBandwidthInfo(sCC1CellInfoKey);

                                                        data.getCell1PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell1DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC1Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC1Band != -1) {
                                                            if (sCC1Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + LAA_BAND_STR;
                                                            } else if (sCC1Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC1BandInd = "" + sCC1Band;
                                                            }
                                                        }

                                                        if (sCC1DlbandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC1BW = sCC1DlbandWidth;
                                                        }

                                                        if (!sCC1UlbandWidth.isEmpty()) {
                                                            if (sCC1UlbandWidth.contains("MHz")) {
                                                                sCC1UlbandWidth = sCC1UlbandWidth.split("MHz")[0].trim();
                                                            }
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = sCC1UlbandWidth;
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BW = "-";
                                                        }

                                                        if (!sCC1UlFreq.isEmpty()) {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "" + ParseUtils.getUlBandIndicator(Integer.parseInt(sCC1UlFreq));
                                                            data.getCell1UlEarfcnDataModel().addValueEvent(sCC1UlFreq, 1);
                                                        } else {
                                                            data.getUlCarrierAggregationDataModel().sCC1BandInd = "-";
                                                            data.getCell1UlEarfcnDataModel().addValueEvent("-", 1);
                                                        }

                                                        data.getLTECell1ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell1RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell1RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell1RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell1SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell1RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell1RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell1RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell1SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell1RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell1RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell1RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell1SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell1RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell1RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell1RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell1SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);

                                                        }

                                                        data.getCell1RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell1RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell1RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell1SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc2":
                                                    if (currentTime >= data.lastTimeSCC2 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC2 = time.getTime();
                                                        String sCC2CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC2bandWidth = data.getDlBandwidthInfo(sCC2CellInfoKey);

                                                        data.getCell2PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell2DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC2Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC2Band != -1) {
                                                            if (sCC2Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + LAA_BAND_STR;
                                                            } else if (sCC2Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC2BandInd = "" + sCC2Band;
                                                            }
                                                        }

                                                        if (sCC2bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC2BW = sCC2bandWidth;
                                                        }

                                                        data.getLTECell2ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell2RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell2RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell2RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell2SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell2RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell2RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell2RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell2SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell2RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell2RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell2RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell2SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell2RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell2RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell2RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell2SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell2RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell2RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell2RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell2SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc3":
                                                    if (currentTime >= data.lastTimeSCC3 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC3 = time.getTime();
                                                        String sCC3CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC3bandWidth = data.getDlBandwidthInfo(sCC3CellInfoKey);

                                                        data.getCell3PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell3DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC3Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC3Band != -1) {
                                                            if (sCC3Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + LAA_BAND_STR;
                                                            } else if (sCC3Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC3BandInd = "" + sCC3Band;
                                                            }
                                                        }

                                                        if (sCC3bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC3BW = sCC3bandWidth;
                                                        }

                                                        data.getLTECell3ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell3RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell3RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell3RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell3SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell3RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell3RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell3RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell3SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell3RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell3RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell3RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell3SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell3RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell3RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell3RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell3SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell3RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell3RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell3RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell3SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc4":
                                                    if (currentTime >= data.lastTimeSCC4 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC4 = time.getTime();
                                                        String sCC4CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC4bandWidth = data.getDlBandwidthInfo(sCC4CellInfoKey);

                                                        data.getCell4PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell4DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC4Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC4Band != -1) {
                                                            if (sCC4Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + LAA_BAND_STR;
                                                            } else if (sCC4Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC4BandInd = "" + sCC4Band;
                                                            }
                                                        }

                                                        if (sCC4bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC4BW = sCC4bandWidth;
                                                        }
                                                        data.getLTECell4ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell4RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell4RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell4RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell4SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell4RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell4RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell4RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell4SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell4RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell4RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell4RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell4SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell4RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell4RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell4RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell4SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }

                                                        data.getCell4RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell4RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell4RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell4SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                case "scc5":
                                                    if (currentTime >= data.lastTimeSCC5 + SCC_SAMPLE_RATE) {

                                                        data.lastTimeSCC5 = time.getTime();
                                                        String sCC5CellInfoKey = i1.getEARFCN() + i2.getPhysicalCellID();
                                                        String sCC5bandWidth = data.getDlBandwidthInfo(sCC5CellInfoKey);

                                                        data.getCell5PCIDataModel().addValueEvent("" + i2.getPhysicalCellID(), 1);
                                                        data.getCell5DlEarfcnDataModel().addValueEvent("" + i1.getEARFCN(), 1);

                                                        int sCC5Band = ParseUtils.getBandIndicator(Integer.parseInt(i1.getEARFCN()));

                                                        if (sCC5Band != -1) {
                                                            if (sCC5Band == LAA_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + LAA_BAND_STR;
                                                            } else if (sCC5Band == CBRS_BAND) {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band + CBRS_BAND_STR;
                                                            } else {
                                                                data.getDlCarrierAggregationDataModel().sCC5BandInd = "" + sCC5Band;
                                                            }
                                                        }

                                                        if (sCC5bandWidth != null) {
                                                            data.getDlCarrierAggregationDataModel().sCC5BW = sCC5bandWidth;
                                                        }

                                                        data.getLTECell5ValidRxConfigDataModel().addValueEvent(i1.getValidRx(), 1);

                                                        //RX0
                                                        if (i1.getValidRx().toLowerCase().contains("rx0")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx0()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx0());
                                                            data.getCell5RSRPRx0DataModel().addValueEvent("" + i2.getInstRSRPRx0(), 1);
                                                            data.getCell5RSRQRx0DataModel().addValueEvent("" + i2.getInstRSRQRx0(), 1);
                                                            data.getCell5RSSIRx0DataModel().addValueEvent("" + i2.getInstRSSIRx0(), 1);
                                                            data.getCell5SINRRx0DataModel().addValueEvent("" + i2.getFTLSNRRx0(), 1);
                                                        }

                                                        //RX1
                                                        if (i1.getValidRx().toLowerCase().contains("rx1")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx1()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx1());
                                                            data.getCell5RSRPRx1DataModel().addValueEvent("" + i2.getInstRSRPRx1(), 1);
                                                            data.getCell5RSRQRx1DataModel().addValueEvent("" + i2.getInstRSRQRx1(), 1);
                                                            data.getCell5RSSIRx1DataModel().addValueEvent("" + i2.getInstRSSIRx1(), 1);
                                                            data.getCell5SINRRx1DataModel().addValueEvent("" + i2.getFTLSNRRx1(), 1);
                                                        }

                                                        //RX2
                                                        if (i1.getValidRx().toLowerCase().contains("rx2")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx2()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx2());
                                                            data.getCell5RSRPRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx2()), 1);
                                                            data.getCell5RSRQRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx2()), 1);
                                                            data.getCell5RSSIRx2DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx2()), 1);
                                                            data.getCell5SINRRx2DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx2()), 1);
                                                        }

                                                        //RX3
                                                        if (i1.getValidRx().toLowerCase().contains("rx3")) {
                                                            if (Double.parseDouble(i2.getFTLSNRRx3()) > instSinr)
                                                                instSinr = Double.parseDouble(i2.getFTLSNRRx3());
                                                            data.getCell5RSRPRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRPRx3()), 1);
                                                            data.getCell5RSRQRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSRQRx3()), 1);
                                                            data.getCell5RSSIRx3DataModel().addValueEvent(String.valueOf(i2.getInstRSSIRx3()), 1);
                                                            data.getCell5SINRRx3DataModel().addValueEvent(String.valueOf(i2.getFTLSNRRx3()), 1);
                                                        }


                                                        data.getCell5RSRPDataModel().addValueEvent("" + i2.getInstMeasuredRSRP(), 1);
                                                        data.getCell5RSRQDataModel().addValueEvent("" + i2.getInstRSRQ(), 1);
                                                        data.getCell5RSSIDataModel().addValueEvent("" + i2.getInstRSSI(), 1);
                                                        if (instSinr != -100.0) {
                                                            data.getCell5SINRDataModel().addValueEvent("" + instSinr, 1);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            //******************************************************************//
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    private void addNewServingCell(List<TimeSeriesDataModel> ServingMeasDataModel, String newServingCellInfo) {

        for (TimeSeriesDataModel dataModel : ServingMeasDataModel) {

            if (dataModel.getDataset().getSeries().size() > 0 &&
                    dataModel.getDataset().getSeries().get(0).getTitle().equals(newServingCellInfo)) {
                continue;
            }

            dataModel.setServingCellInfo(newServingCellInfo);
            //Logger.enteringSpec("Calling addOrSwapSeries(): " + dataModel.getName());
            dataModel.getDataset().addOrSwapSeries(newServingCellInfo);
        }
    }

    @Override
    public int getType() {
        return TYPE;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public List<String> getText() {
        return null;
    }

}
