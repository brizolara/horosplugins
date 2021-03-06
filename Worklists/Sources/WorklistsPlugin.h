//
//  WorklistsPlugin.h
//  Worklists
//
//  Created by Alessandro Volz on 09/11/2012.
//  Copyright 2012 OsiriX Team. All rights reserved.
//

#import <OsiriXAPI/PluginFilter.h>


@class Worklist;


extern NSString* const WorklistsDefaultsKey;
extern NSString* const WorklistAlbumIDsDefaultsKey;


@interface WorklistsPlugin : PluginFilter {
    NSArrayController* _worklists; // this is bound to the NSUserDefaults array of dictionaries
    NSString* _cachePath;
    NSMutableDictionary* _studiesLastSeenDates;
    NSMutableDictionary* _worklistObjs;
    NSMutableDictionary* _errors;
    NSTimer* _urlSyncTimer;
    NSMenuItem* _pluginMenuItem;
    BOOL _refreshDisabled;
    NSTimer* _refreshReenableTimer;
}

@property(readonly,retain) NSArrayController* worklists;
@property(readonly,retain) NSTimer* urlSyncTimer;
@property(readonly) BOOL refreshDisabled;

+ (WorklistsPlugin*)instance;

- (void)deselectAlbumOfWorklist:(Worklist*)worklist;

- (void)setError:(id)error onWorklist:(Worklist*)worklist;
- (void)clearErrorOnWorklist:(Worklist*)worklist;

- (void)setLastSeenDate:(NSDate*)date forStudy:(DicomStudy*)study worklist:(Worklist*)worklist;
- (NSDate*)lastSeenDateForStudy:(DicomStudy*)study worklist:(Worklist*)worklist;
- (void)saveSLSDs;

+ (void)refreshAlbumsForDatabase:(DicomDatabase*)db;

@end
