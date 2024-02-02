import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'vc-static',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './static.component.html',
    styleUrls: ['static.component.scss'],
})
export class StaticComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
