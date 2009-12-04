// _MIRCVideoRecord_EOArchive_English.java
// Generated by EnterpriseObjects palette at Tuesday, August 30, 2005 10:10:40 PM America/Denver

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.eointerface.swing.EOTable._EOTableColumn;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _MIRCVideoRecord_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    NSFontManager _nsFontManager0;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOTable _nsTableView0;
    com.webobjects.eointerface.swing.EOTable._EOTableColumn _eoTableColumn0, _eoTableColumn1, _eoTableColumn2, _eoTableColumn3;
    com.webobjects.eointerface.swing.EOTextField _eoTextField0, _eoTextField1, _nsTextField0;
    javax.swing.JButton _jButton0, _jButton1, _nsButton0, _nsButton1, _nsButton2, _nsButton3;
    javax.swing.JPanel _nsView0;

    public _MIRCVideoRecord_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _eoTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "");
        _eoTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "");
        _nsFontManager0 = (NSFontManager)_registered(new NSFontManager(), "Font Manager");
        _jButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Remove"), "");
        _jButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Settings"), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "mCaptureToField")) != null)) {
            _nsTextField0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextField)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextField0");
        } else {
            _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "mAddAudioButton.nextFocusableComponent.nextFocusableComponent.nextFocusableComponent")) != null)) {
            _nsButton3 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton3");
        } else {
            _nsButton3 = (javax.swing.JButton)_registered(new javax.swing.JButton("Stop"), "NSButton4");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "mAddAudioButton.nextFocusableComponent.nextFocusableComponent")) != null)) {
            _nsButton2 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton2");
        } else {
            _nsButton2 = (javax.swing.JButton)_registered(new javax.swing.JButton("Record"), "NSButton3");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "mAddAudioButton.nextFocusableComponent")) != null)) {
            _nsButton1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton1");
        } else {
            _nsButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Add Video Track"), "NSButton2");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "mAddAudioButton")) != null)) {
            _nsButton0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton0");
        } else {
            _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Add Audio Track"), "NSButton1");
        }

        _eoTableColumn3 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "");
        _eoTableColumn2 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "");
        _eoTableColumn1 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "NSTableColumn1");
        _eoTableColumn0 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "NSTableColumn");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "mTableView")) != null)) {
            _nsTableView0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTable)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTableView0");
        } else {
            _nsTableView0 = (com.webobjects.eointerface.swing.EOTable)_registered(new com.webobjects.eointerface.swing.EOTable(), "NSTableView");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "WhackedWindow");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_eoFrame0, _owner(), "delegate");
        }

        _jButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "removeChannel", _jButton1), ""));
        _jButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "doChannelSettings", _jButton0), ""));

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _connect(_nsTableView0, _owner(), "delegate");
        }

        if (_replacedObjects.objectForKey("_nsTextField0") == null) {
            _connect(_owner(), _nsTextField0, "mCaptureToField");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "mWhackedWindow");
        }

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _connect(_owner(), _nsTableView0, "mTableView");
        }

        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "addAudioTrack", _nsButton0), ""));

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _connect(_owner(), _nsButton1, "mAddVideoButton");
        }

        _nsButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "addVideoTrack", _nsButton1), ""));

        if (_replacedObjects.objectForKey("_nsButton2") == null) {
            _connect(_owner(), _nsButton2, "mRecordPauseButton");
        }

        _nsButton2.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "recordPause", _nsButton2), ""));

        if (_replacedObjects.objectForKey("_nsButton3") == null) {
            _connect(_owner(), _nsButton3, "mStopButton");
        }

        _nsButton3.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "stop", _nsButton3), ""));

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _connect(_owner(), _nsButton0, "mAddAudioButton");
        }

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _connect(_nsTableView0, _owner(), "dataSource");
        }
    }

    protected void _init() {
        super._init();
        _setFontForComponent(_eoTextField1, "Lucida Grande", 11, Font.PLAIN);
        _setFontForComponent(_eoTextField0, "Lucida Grande", 11, Font.PLAIN);
        _setFontForComponent(_jButton1, "Lucida Grande", 12, Font.PLAIN);
        _jButton1.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_jButton0, "Lucida Grande", 12, Font.PLAIN);
        _jButton0.setMargin(new Insets(0, 2, 0, 2));

        if (_replacedObjects.objectForKey("_nsTextField0") == null) {
            _setFontForComponent(_nsTextField0, "Lucida Grande", 13, Font.PLAIN);
            _nsTextField0.setEditable(false);
            _nsTextField0.setOpaque(false);
            _nsTextField0.setText("System Font Text");
            _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            _nsTextField0.setSelectable(false);
            _nsTextField0.setEnabled(true);
            _nsTextField0.setBorder(null);
        }

        _connect(_nsTableView0, _nsButton0, "nextFocusableComponent");

        if (_replacedObjects.objectForKey("_nsButton3") == null) {
            _setFontForComponent(_nsButton3, "Lucida Grande", 13, Font.PLAIN);
            _nsButton3.setMargin(new Insets(0, 2, 0, 2));
        }

        if (_replacedObjects.objectForKey("_nsButton2") == null) {
            _connect(_nsButton2, _nsButton3, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsButton2") == null) {
            _setFontForComponent(_nsButton2, "Lucida Grande", 13, Font.PLAIN);
            _nsButton2.setMargin(new Insets(0, 2, 0, 2));
        }

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _connect(_nsButton1, _nsButton2, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _setFontForComponent(_nsButton1, "Lucida Grande", 11, Font.PLAIN);
            _nsButton1.setMargin(new Insets(0, 2, 0, 2));
        }

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _connect(_nsButton0, _nsButton1, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _setFontForComponent(_nsButton0, "Lucida Grande", 11, Font.PLAIN);
            _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        }

        _eoTableColumn3.setMinWidth(49);
        _eoTableColumn3.setMaxWidth(1000);
        _eoTableColumn3.setPreferredWidth(49);
        _eoTableColumn3.setWidth(49);
        _eoTableColumn3.setResizable(false);
        _eoTableColumn3.setHeaderValue("Remove");
        if ((_eoTableColumn3.getCellRenderer() instanceof DefaultTableCellRenderer) || (_eoTableColumn3.getCellRenderer() == null)) {
        	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        	renderer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        	_eoTableColumn3.setCellRenderer(renderer);
        }
        _eoTableColumn2.setMinWidth(50);
        _eoTableColumn2.setMaxWidth(1000);
        _eoTableColumn2.setPreferredWidth(59);
        _eoTableColumn2.setWidth(59);
        _eoTableColumn2.setResizable(false);
        _eoTableColumn2.setHeaderValue("Settings");
        if ((_eoTableColumn2.getCellRenderer() instanceof DefaultTableCellRenderer) || (_eoTableColumn2.getCellRenderer() == null)) {
        	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        	renderer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        	_eoTableColumn2.setCellRenderer(renderer);
        }
        _eoTableColumn1.setMinWidth(8);
        _eoTableColumn1.setMaxWidth(1000);
        _eoTableColumn1.setPreferredWidth(312);
        _eoTableColumn1.setWidth(312);
        _eoTableColumn1.setResizable(false);
        _eoTableColumn1.setHeaderValue("Summary");
        _eoTableColumn0.setMinWidth(40);
        _eoTableColumn0.setMaxWidth(1000);
        _eoTableColumn0.setPreferredWidth(40);
        _eoTableColumn0.setWidth(40);
        _eoTableColumn0.setResizable(false);
        _eoTableColumn0.setHeaderValue("Type");
        if ((_eoTableColumn0.getCellRenderer() instanceof DefaultTableCellRenderer) || (_eoTableColumn0.getCellRenderer() == null)) {
        	DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        	renderer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        	_eoTableColumn0.setCellRenderer(renderer);
        }
        if ((_eoTableColumn0.getHeaderRenderer() != null)) {
        	((DefaultTableCellRenderer)(_eoTableColumn0.getHeaderRenderer())).setHorizontalAlignment(javax.swing.JTextField.LEFT);
        }

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _nsTableView0.table().addColumn(_eoTableColumn0);
            _nsTableView0.table().addColumn(_eoTableColumn1);
            _nsTableView0.table().addColumn(_eoTableColumn2);
            _nsTableView0.table().addColumn(_eoTableColumn3);
            _setFontForComponent(_nsTableView0.table().getTableHeader(), "Lucida Grande", 11, Font.PLAIN);
            _nsTableView0.table().setRowHeight(21);
        }

        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsTableView0.setSize(486, 56);
        _nsTableView0.setLocation(-7, 33);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTableView0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _nsView0.add(_nsTableView0);
        _nsButton0.setSize(109, 22);
        _nsButton0.setLocation(126, 95);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinXMargin | EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);
        _nsButton1.setSize(109, 22);
        _nsButton1.setLocation(240, 95);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton1, EOViewLayout.MinXMargin | EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton1);
        _nsButton2.setSize(79, 26);
        _nsButton2.setLocation(157, 154);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton2, EOViewLayout.MinXMargin | EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton2);
        _nsButton3.setSize(79, 26);
        _nsButton3.setLocation(239, 154);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton3, EOViewLayout.MinXMargin | EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton3);
        _nsTextField0.setSize(271, 17);
        _nsTextField0.setLocation(100, 8);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField0);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(472, 190);
            _eoFrame0.setTitle("OsiriX Video");
            _eoFrame0.setLocation(69, 758);
            _eoFrame0.setSize(472, 190);
        }
    }
}