import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'vc-light',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './light.component.html',
    styleUrls: ['light.component.scss'],
})
export class LightComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
